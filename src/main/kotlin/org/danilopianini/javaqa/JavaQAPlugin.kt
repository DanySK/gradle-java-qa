package org.danilopianini.javaqa

import com.github.spotbugs.snom.SpotBugsExtension
import com.github.spotbugs.snom.SpotBugsPlugin
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.plugins.quality.CheckstyleExtension
import org.gradle.api.plugins.quality.CheckstylePlugin
import org.gradle.api.plugins.quality.PmdExtension
import org.gradle.api.plugins.quality.PmdPlugin
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.register
import org.gradle.testing.jacoco.plugins.JacocoPlugin
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import java.io.File
import java.io.Serializable
import java.util.Properties

/**
 * Just a template.
 */
open class JavaQAPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            plugins.withType(JavaPlugin::class.java) {
                val extension = project.extensions.create("javaQA", JavaQAExtension::class.java, this)
                with(plugins) {
                    apply(CheckstylePlugin::class)
                    apply(PmdPlugin::class)
                    apply(JacocoPlugin::class)
                    apply(SpotBugsPlugin::class)
                }
                configureExtension<SpotBugsExtension> {
                    toolVersion.set(versionOf("spotbugs"))
                    setEffort("max")
                    setReportLevel("low")
                    showProgress.set(false)
                    val excludes = createFromResource(spotbugsExcludes, File(javaQADestination, "spotbugs-excludes"))
                    excludeFilter.set(excludes)
                }
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
                configureExtension<PmdExtension> {
                    toolVersion = versionOf("pmd")
                    ruleSets = listOf()
                    ruleSetConfig = resources.text.fromString(loadResource(pmdPath))
                }
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

        private val Project.javaQADestination get() = File(buildDir, "javaqa").apply { mkdirs() }

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

/**
 * Just a template.
 */
open class HelloTask : DefaultTask() {

    /**
     * Just a template.
     */
    @Input
    val author: Property<String> = project.objects.property()

    /**
     * Read-only property calculated from the greeting.
     */
    @Internal
    val message: Provider<String> = author.map { "Hello from $it" }

    /**
     * Just a template.
     */
    @TaskAction
    fun printMessage() {
        logger.quiet(message.get())
    }
}

/**
 * Just a template.
 */
open class HelloExtension(objects: ObjectFactory) : Serializable {

    /**
     * Just a template.
     */
    val author: Property<String> = objects.property()

    companion object {
        private const val serialVersionUID = 1L
    }
}
