package org.danilopianini.javaqa

import org.gradle.api.Project
import org.gradle.api.provider.Property

open class JavaQAExtension(
    private val project: Project
) {
    internal val checkstyle = Checkstyle()

    fun checkstyle(action: Checkstyle.() -> Unit) { checkstyle.action() }

    inner class Checkstyle {
        val additionalSuppressions: Property<String> = project.objects.property(String::class.java)
        val additionalConfiguration: Property<String> = project.objects.property(String::class.java)
    }
}