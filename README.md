# Java Automated Quality Assurance

This Gradle plugin applies Checkstyle, PMD, SpotBugs, and JaCoCo under the hood.
More static checkers may come in the future.
All checkers' configuration have been customized to match my requirements.

These settings can be changed as you would when configuring the checkers,
this plugin pre-configures them, but does not force anything.

## How to use

```kotlin
plugins {
    id("org.danilopianini.gradle-java-qa") version "<SELECT THE VERSION>"
}
```

### Adding configuration to checkstyle

Pieces of configuration can be added to checkstyle without the need to override the project default configuration.

```kotlin
javaQA {
    checkstyle {
        additionalSuppressions.set("Path to suppressions, or string with the suppressions")
        additionalConfiguration("Path to a file with additional rules, or a string with the same content")
    }
}
```
