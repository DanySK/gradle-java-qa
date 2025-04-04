package org.danilopianini.javaqa

import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.property

/**
 * Extension for the Java QA plugin.
 */
open class JavaQAExtension(private val project: Project) {
    internal val checkstyle = Checkstyle()

    /**
     * The Java version to use for the project.
     * It is used to set the source and target compatibility.
     * This value defaults to the latest version of Java supported by all tools at the release time of the plugin.
     */
    val javaVersion: Property<Int> = project.objects.property()

    /**
     * DSL access to the checkstyle configuration.
     */
    fun checkstyle(action: Checkstyle.() -> Unit) {
        checkstyle.action()
    }

    /**
     * Option collection for checkstyle.
     */
    inner class Checkstyle {
        /**
         * Add suppressions to the pre-defined list.
         * It can be the path of a file with the suppressions in XML format or a string with the same content.
         */
        val additionalSuppressions: Property<String> = project.objects.property(String::class.java)

        /**
         * Add rules to the pre-defined configuration.
         * It can be the path of a file with the rules in XML format or a string with the same content.
         */
        val additionalConfiguration: Property<String> = project.objects.property(String::class.java)
    }
}
