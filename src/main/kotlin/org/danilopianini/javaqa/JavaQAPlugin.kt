package org.danilopianini.javaqa

import com.github.spotbugs.snom.SpotBugsExtension
import com.github.spotbugs.snom.SpotBugsPlugin
import de.aaschmid.gradle.plugins.cpd.CpdExtension
import de.aaschmid.gradle.plugins.cpd.CpdPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.FileTree
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.plugins.quality.CheckstyleExtension
import org.gradle.api.plugins.quality.CheckstylePlugin
import org.gradle.api.plugins.quality.PmdExtension
import org.gradle.api.plugins.quality.PmdPlugin
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.findByType
import org.gradle.testing.jacoco.plugins.JacocoPlugin
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import java.io.File
import java.util.Properties

/**
 * Just a template.
 */
open class JavaQAPlugin : Plugin<Project> {
    @Suppress("UnstableApiUsage")
    override fun apply(project: Project) {
        with(project) {
            plugins.withType(JavaPlugin::class.java) {
                val extension = project.extensions.create("javaQA", JavaQAExtension::class.java, this)
                with(plugins) {
                    apply(CheckstylePlugin::class)
                    apply(CpdPlugin::class)
                    apply(PmdPlugin::class)
                    apply(JacocoPlugin::class)
                    apply(SpotBugsPlugin::class)
                }
                // SpotBugs
                configureExtension<SpotBugsExtension> {
                    toolVersion.set(versionOf("spotbugs"))
                    setEffort("max")
                    setReportLevel("low")
                    showProgress.set(false)
                    val excludes = createFromResource(
                        spotbugsExcludes,
                        File(javaQADestination, "spotbugs-excludes.xml")
                    )
                    excludeFilter.set(excludes)
                }
                // Checkstyle
                configureExtension<CheckstyleExtension> {
                    toolVersion = versionOf("checkstyle")
                    fun String.fromFileOrItself() = File(this).takeIf { it.exists() }?.readText() ?: this
                    fun Property<String>.fromFileOrItself() = getOrElse("").fromFileOrItself()
                    val additionalSuppressions = extension.checkstyle.additionalSuppressions.fromFileOrItself()
                    val suppressions = loadResource(checkstyleSuppressionsPath)
                        .replace(Regex("<!--\\s*ADDITIONAL_SUPPRESSIONS\\s*-->"), additionalSuppressions)
                    val suppressionsFile = File(javaQADestination, "checkstyle-suppressions.xml")
                    suppressionsFile.writeText(suppressions)
                    val additionalRules = extension.checkstyle.additionalConfiguration.fromFileOrItself()
                    val configuration = loadResource(checkstylePath)
                        .replace(Regex("<!--\\s*SUPPRESSIONS_FILE\\s*-->"), suppressionsFile.path.replace('\\', '/'))
                        .replace(Regex("<!--\\s*ADDITIONAL_CONFIGURATION\\s*-->"), additionalRules)
                    config = resources.text.fromString(configuration)
                }
                // PMD
                val pmdVersion = versionOf("pmd")
                configureExtension<PmdExtension> {
                    toolVersion = pmdVersion
                    ruleSets = listOf()
                    ruleSetConfig = resources.text.fromString(loadResource(pmdPath))
                }
                // CPD
                configureExtension<CpdExtension> {
                    toolVersion = pmdVersion
                }
                tasks.create<de.aaschmid.gradle.plugins.cpd.Cpd>("cpdJavaCheck") {
                    language = "java"
                    source = project.extensions.findByType<JavaPluginExtension>()
                        ?.sourceSets
                        ?.flatMap { it.allSource }
                        ?.map {
                            fileTree(it) {
                                include("**/*.java")
                            }
                        }
                        ?.fold(files().asFileTree, FileTree::plus)
                        ?: files().asFileTree
                    minimumTokenCount = 100
                    ignoreFailures = false
                    tasks.findByName("check")?.dependsOn(this)
                }
                // Disable the default cpdCheck to prevent conflict or double execution
                tasks.findByName("cpdCheck")?.enabled = false
                // Jacoco
                configureExtension<JacocoPluginExtension> {
                    toolVersion = versionOf("jacoco")
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

    companion object {

        private const val root = "org/danilopianini/javaqa"
        private const val checkstylePath = "$root/checkstyle.xml"
        private const val checkstyleSuppressionsPath = "$root/checkstyle-suppressions.xml"
        private const val pmdPath = "$root/pmd.xml"
        private const val spotbugsExcludes = "$root/spotbugs-excludes.xml"

        private val Project.javaQADestination get() = File(rootProject.buildDir, "javaqa").apply { mkdirs() }

        private inline fun <reified T : Any> Project.configureExtension(crossinline action: T.() -> Unit) {
            project.extensions.configure(T::class) { it.action() }
        }

        private fun createFromResource(source: String, destination: File): File = destination.apply {
            writeText(loadResource(source))
        }

        private fun resource(path: String) = Thread.currentThread().contextClassLoader.getResource(path)
            ?: throw IllegalStateException("Unable to access resource $path in the current classpath")

        private fun loadResource(path: String): String = resource(path).readText()

        private fun versionOf(library: String): String = Properties().run {
            load(resource("$root/versions.properties").openStream())
            get(library)?.toString() ?: throw IllegalStateException("Unable to load version for $library")
        }
    }
}
