# Java Automated Quality Assurance

This Gradle plugin applies Checkstyle, PMD, CPD, SpotBugs, and JaCoCo under the hood.
More static checkers may come in the future.
All checkers' configuration have been customized to match my requirements.

These settings can be changed as you would when configuring the checkers,
this plugin pre-configures them, but does not force anything.

## How to use

This plugin auto-configures Checkstyle, PMD, CPD, SpotBugs, and JaCoCo and the JVM to use them.
The JVM is configured via the Gradle's toolchains.
Thus, the first step is to make sure that you can resolve the JVM version required by this plugin.
Unless you have very specific requirements, we suggest to apply the Foojay Convention plugin to your `settings.gradle.kts`:

```kotlin
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0" // Pick the most recent version
}
```

Now, you can enable the plugin in your `build.gradle.kts`:

```kotlin
plugins {
    id("org.danilopianini.gradle-java-qa") version "<SELECT THE VERSION>"
}
```

Once done, checkstyle, PMD, FindBugs, and CPD will be applied and pre-configured aggressively,
but not exceedingly so, in particular, most rules with arbitrary numbers
(e.g. "too many methods")
have been either suppressed or configured permissively.

The default configuration can be modified as would have for the normal plugin application.
Moreover, in the case of checkstyle,
it is possible to add rules and exception without the need to overwrite the proposed default.

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
