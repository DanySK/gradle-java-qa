import org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION as KOTLIN_VERSION

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    jacoco
    `java-gradle-plugin`
    alias(libs.plugins.dokka)
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.gradlePluginPublish)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.qa)
    alias(libs.plugins.publishOnCentral)
    alias(libs.plugins.multiJvmTesting)
    alias(libs.plugins.taskTree)
}

/*
 * Project information
 */
group = "org.danilopianini"
description = "Automated Quality Assurance configuration for Java Projects built with Gradle"
inner class ProjectInfo {
    val longName = "Java Quality Assurance Gradle plugin"
    val website = "https://github.com/DanySK/$name"
    val vcsUrl = "$website.git"
    val scm = "scm:git:$website.git"
    val pluginImplementationClass = "$group.javaqa.JavaQAPlugin"
    val tags = listOf("java", "static analysis", "quality assurance", "qa", "style", "bugs")
}
val info = ProjectInfo()

gitSemVer {
    buildMetadataSeparator.set("-")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

tasks.create("copyToolVersions") {
    inputs.file(File(rootProject.rootDir, "gradle/libs.versions.toml"))
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { dependsOn(this@create) }
    doLast {
        val buildDir = project.buildDir.absolutePath
        val destinationDir = File(buildDir, "resources/main/org/danilopianini/javaqa/")
        destinationDir.mkdirs()
        val destination = File(destinationDir, "versions.properties")
        val catalog = file("${rootProject.rootDir.absolutePath}/gradle/libs.versions.toml").readText()
        val libraries = listOf("checkstyle", "jacoco", "pmd", "spotbugs")
            .map { library ->
                val version = Regex("""^$library\s*=\s*"([\d\w\.\-\+]+)"\s*$""", RegexOption.MULTILINE)
                    .findAll(catalog)
                    .firstOrNull()
                    ?.destructured
                    ?.component1()
                    ?: throw IllegalStateException("No version available for $library in:\n$catalog")
                "$library=$version"
            }
            .joinToString("\n")
        destination.writeText(libraries)
    }
}

multiJvm {
    jvmVersionForCompilation.set(11)
    maximumSupportedJvmVersion.set(latestJavaSupportedByGradle)
}

dependencies {
    api(gradleApi())
    api(gradleKotlinDsl())
    api(libs.bundles.qa.plugins)
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(gradleTestKit())
    testImplementation(libs.konf.yaml)
    testImplementation(libs.classgraph)
    testImplementation(libs.bundles.kotlin.testing)
}

// Enforce Kotlin version coherence
configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.jetbrains.kotlin" && requested.name.startsWith("kotlin")) {
            useVersion(KOTLIN_VERSION)
            because("All Kotlin modules should use the same version, and compiler uses $KOTLIN_VERSION")
        }
    }
}

kotlin {
    target {
        compilations.all {
            kotlinOptions {
                allWarningsAsErrors = true
                freeCompilerArgs = listOf("-XXLanguage:+InlineClasses", "-opt-in=kotlin.RequiresOptIn")
            }
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = true
        showCauses = true
        showStackTraces = true
        events(*org.gradle.api.tasks.testing.logging.TestLogEvent.values())
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}

tasks.cpdKotlinCheck {
    exclude("**/*.kts")
}

signing {
    if (System.getenv()["CI"].equals("true", ignoreCase = true)) {
        val signingKey: String? by project
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKey, signingPassword)
    }
}

/*
 * Publication on Maven Central and the Plugin portal
 */
publishOnCentral {
    projectLongName.set(info.longName)
    projectDescription.set(description ?: TODO("Missing description"))
    projectUrl.set(info.website)
    scmConnection.set(info.scm)
    repository("https://maven.pkg.github.com/DanySK/${rootProject.name}".toLowerCase(), name = "github") {
        user.set("danysk")
        password.set(System.getenv("GITHUB_TOKEN"))
    }
}

publishing {
    publications {
        withType<MavenPublication> {
            pom {
                developers {
                    developer {
                        name.set("Danilo Pianini")
                        email.set("danilo.pianini@gmail.com")
                        url.set("http://www.danilopianini.org/")
                    }
                }
            }
        }
    }
}

gradlePlugin {
    plugins {
        website.set(info.website)
        vcsUrl.set(info.vcsUrl)
        create("") {
            id = "$group.${project.name}"
            displayName = info.longName
            description = project.description
            implementationClass = info.pluginImplementationClass
            tags.set(info.tags)
        }
    }
}
