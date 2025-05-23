package org.danilopianini.javaqa

import com.github.spotbugs.snom.Confidence
import com.github.spotbugs.snom.Effort
import com.github.spotbugs.snom.SpotBugsExtension
import com.github.spotbugs.snom.SpotBugsPlugin
import com.github.spotbugs.snom.SpotBugsTask
import de.aaschmid.gradle.plugins.cpd.Cpd
import de.aaschmid.gradle.plugins.cpd.CpdExtension
import de.aaschmid.gradle.plugins.cpd.CpdPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.FileTree
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.plugins.quality.Checkstyle
import org.gradle.api.plugins.quality.CheckstyleExtension
import org.gradle.api.plugins.quality.CheckstylePlugin
import org.gradle.api.plugins.quality.Pmd
import org.gradle.api.plugins.quality.PmdExtension
import org.gradle.api.plugins.quality.PmdPlugin
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.javadoc.Javadoc
import org.gradle.external.javadoc.CoreJavadocOptions
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.jvm.toolchain.JavaLauncher
import org.gradle.jvm.toolchain.JavaToolchainService
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.exclude
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.withType
import org.gradle.testing.jacoco.plugins.JacocoPlugin
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import java.io.File
import java.util.Properties
import javax.inject.Inject
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties

/**
 * Just a template.
 */
@Suppress("unused")
abstract class JavaQAPlugin : Plugin<Project> {
    @get:Inject
    internal abstract val javaToolchains: JavaToolchainService

    @Suppress("UnstableApiUsage")
    override fun apply(project: Project) {
        with(project) {
            // Resources from the classpath must be loaded upfront
            val javaQADestination =
                project.layout.buildDirectory
                    .dir("javaqa")
                    .get()
                    .asFile
                    .apply { mkdirs() }
            val baseSpotBugsExcludes = loadResource(SPOTBUGS_SUPPRESSIONS_RESOURCE)
            val baseCheckstyleExcludes = loadResource(CHECKSTYLE_SUPPRESSIONS_RESOURCE)
            val checkstyleConfiguration = loadResource(CHECKSTYLE_PATH)
            val defaultJavaVersion = loadResource(JAVA_VERSION_RESOURCE).trim().substringBefore('.').toInt()
            val pmdConfiguration = loadResource(PMD_PATH)
            val extension: JavaQAExtension =
                project.extensions.create("javaQA", JavaQAExtension::class.java, this)
            runCatching {
                project.extensions.findByName("multiJvm")?.let { multiJvm: Any ->
                    logger.info("${this::class.simpleName} detected the application of the MultiJVMTesting plugin")
                    val property = multiJvm::class.memberProperties.single { it.name == "jvmVersionForCompilation" }

                    @Suppress("UNCHECKED_CAST")
                    val jvmVersionProvider = (property as KProperty1<Any, *>).get(multiJvm) as Provider<Int>
                    extension.javaVersion.convention(jvmVersionProvider)
                    logger.info("${this::class.simpleName} is defaulting to the Java version from MultiJVMTesting")
                }
            }.onFailure {
                logger.error("MultiJVMTestingPlugin configuration failed: ", it)
            }
            plugins.withType(JavaPlugin::class.java) { _ ->
                // Apply the Java QA plugins
                with(plugins) {
                    apply(CheckstylePlugin::class)
                    apply(CpdPlugin::class)
                    apply(PmdPlugin::class)
                    apply(JacocoPlugin::class)
                    apply(SpotBugsPlugin::class)
                }
                // Prepare the Java launcher
                val javaLauncher: Provider<JavaLauncher> =
                    javaToolchains.launcherFor {
                        it.languageVersion.set(
                            JavaLanguageVersion.of(extension.javaVersion.getOrElse(defaultJavaVersion)),
                        )
                    }
                // Javadoc
                tasks.withType<Javadoc> {
                    (options as? CoreJavadocOptions)?.addStringOption("Xwerror", "-quiet")
                }
                // SpotBugs
                configureExtension<SpotBugsExtension> {
                    // Create a task creating the default configuration
                    val spotbugsExcludesFile = File(javaQADestination, SPOTBUGS_SUPPRESSIONS_FILE_NAME)
                    val populateDefaultSpotBugsExcludes =
                        tasks.register("populateDefaultSpotBugsExcludes") {
                            it.doLast {
                                spotbugsExcludesFile.createWithContent(baseSpotBugsExcludes)
                            }
                        }
                    tasks.withType<SpotBugsTask>().configureEach { spotBugsTask ->
                        spotBugsTask.dependsOn(populateDefaultSpotBugsExcludes)
                        spotBugsTask.launcher.set(javaLauncher)
                    }
                    toolVersion.set(spotBugsVersion)
                    effort.set(Effort.MAX)
                    reportLevel.set(Confidence.LOW)
                    showProgress.set(false)
                    excludeFilter.set(spotbugsExcludesFile)
                }

                // Checkstyle
                fun Provider<String>.fromFileOrItself(): String = getOrElse("").let { maybePath ->
                    File(maybePath).takeIf { it.exists() }?.readText() ?: maybePath
                }
                configureExtension<CheckstyleExtension> {
                    val checkstyleConfigurationFile = File(javaQADestination, CHECKSTYLE_CONFIGURATION_NAME)
                    // Create a task creating the default configuration
                    val checkstyleSuppressionsFile = File(javaQADestination, CHECKSTYLE_SUPPRESSIONS_FILE_NAME)
                    val generateCheckstyleConfiguration =
                        tasks.register("generateCheckstyleConfiguration") {
                            it.outputs.files(files(checkstyleSuppressionsFile, checkstyleConfigurationFile))
                            it.doLast {
                                logger.debug(
                                    "Creating configuration file for checkstyle {}",
                                    checkstyleConfigurationFile.absolutePath,
                                )

                                fun String.doublyBackslashed() = replace("\\", "\\\\")
                                val actualConfiguration =
                                    checkstyleConfiguration.replace(
                                        Regex("<!--\\s*ADDITIONAL_CONFIGURATION\\s*-->"),
                                        extension.checkstyle.additionalConfiguration
                                            .fromFileOrItself()
                                            .doublyBackslashed(),
                                    )
                                checkstyleConfigurationFile.createWithContent(actualConfiguration)
                                logger.debug(
                                    "Creating suppressions file for checkstyle {}",
                                    checkstyleSuppressionsFile.absolutePath,
                                )
                                checkstyleSuppressionsFile.createWithContent(
                                    baseCheckstyleExcludes.replace(
                                        Regex("<!--\\s*ADDITIONAL_SUPPRESSIONS\\s*-->"),
                                        extension.checkstyle.additionalSuppressions
                                            .fromFileOrItself()
                                            .doublyBackslashed(),
                                    ),
                                )
                            }
                        }
                    configurations.named("checkstyle").configure { checkstyleConfiguration ->
                        checkstyleConfiguration.exclude(group = "com.google.collections", module = "google-collections")
                    }
                    tasks.withType<Checkstyle>().configureEach { checkstyleTask ->
                        checkstyleTask.javaLauncher.set(javaLauncher)
                        checkstyleTask.inputs.files(files(checkstyleSuppressionsFile, checkstyleConfigurationFile))
                        checkstyleTask.dependsOn(generateCheckstyleConfiguration)
                    }
                    toolVersion = checkstyleVersion
                    configDirectory.set(javaQADestination)
                    config = resources.text.fromFile(checkstyleConfigurationFile)
                }
                // PMD
                configureExtension<PmdExtension> {
                    isConsoleOutput = true
                    toolVersion = pmdVersion
                    ruleSets = listOf()
                    ruleSetConfig = resources.text.fromString(pmdConfiguration)
                }
                tasks.withType<Pmd>().configureEach { pmdTask -> pmdTask.javaLauncher.set(javaLauncher) }
                // CPD
                configureExtension<CpdExtension> {
                    toolVersion = pmdVersion
                }
                tasks.register("cpdJavaCheck", Cpd::class) { cpd ->
                    cpd.language = "java"
                    cpd.source = project.extensions
                        .findByType<JavaPluginExtension>()
                        ?.sourceSets
                        ?.flatMap { it.allSource }
                        ?.map {
                            project.fileTree(it) { fileTree ->
                                fileTree.include("**/*.java")
                            }
                        }?.fold(files().asFileTree, FileTree::plus)
                        ?: files().asFileTree
                    cpd.minimumTokenCount = 100
                    cpd.ignoreFailures = false
                    tasks.findByName("check")?.dependsOn(this)
                }
                // Disable the default cpdCheck to prevent conflict or double execution
                tasks.findByName("cpdCheck")?.enabled = false
                // Jacoco
                configureExtension<JacocoPluginExtension> {
                    toolVersion = jacocoVersion
                }
                tasks.withType(JacocoReport::class.java) { jacocoReport ->
                    jacocoReport.reports {
                        it.xml.required.set(true)
                    }
                    project.tasks.findByName("check")?.finalizedBy(jacocoReport)
                }
            }
        }
    }

    /**
     * Companion object for the plugin.
     */
    companion object {
        private const val PACKAGE_ROOT = "org/danilopianini/javaqa"
        private const val CHECKSTYLE_PATH = "$PACKAGE_ROOT/checkstyle.xml"
        private const val CHECKSTYLE_CONFIGURATION_NAME = "checkstyle.xml"
        private const val CHECKSTYLE_SUPPRESSIONS_FILE_NAME = "checkstyle-suppressions.xml"
        private const val CHECKSTYLE_SUPPRESSIONS_RESOURCE = "$PACKAGE_ROOT/$CHECKSTYLE_SUPPRESSIONS_FILE_NAME"
        private const val PMD_PATH = "$PACKAGE_ROOT/pmd.xml"
        private const val SPOTBUGS_SUPPRESSIONS_FILE_NAME = "spotbugs-excludes.xml"
        private const val SPOTBUGS_SUPPRESSIONS_RESOURCE = "$PACKAGE_ROOT/$SPOTBUGS_SUPPRESSIONS_FILE_NAME"
        private const val JAVA_VERSION_RESOURCE = "$PACKAGE_ROOT/.java-version"

        /**
         * The default version of SpotBugs.
         */
        val spotBugsVersion = versionOf("spotbugs")

        /**
         * The default version of checkstyle.
         */
        val checkstyleVersion = versionOf("checkstyle")

        /**
         * The default version of JaCoCo.
         */
        val jacocoVersion = versionOf("jacoco")

        /**
         * The default version of PMD.
         */
        val pmdVersion = versionOf("pmd")

        private inline fun <reified T : Any> Project.configureExtension(crossinline action: T.() -> Unit) {
            extensions.configure(T::class) { it.action() }
        }

        private fun File.createWithContent(source: String): File = apply {
            parentFile.mkdirs()
            if (!exists() || readText() != source) {
                writeText(source)
            }
        }

        private fun resource(path: String) = checkNotNull(Thread.currentThread().contextClassLoader.getResource(path)) {
            "Unable to access resource $path in the current classpath"
        }

        private fun loadResource(path: String): String = resource(path).readText()

        private fun versionOf(library: String): String = Properties().run {
            load(resource("META-INF/javaqa/tool-versions.properties").openStream())
            checkNotNull(get(library)?.toString()) {
                "Unable to load version for $library"
            }
        }
    }
}
