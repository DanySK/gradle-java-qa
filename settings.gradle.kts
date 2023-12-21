rootProject.name = "gradle-java-qa"

plugins {
    id("com.gradle.enterprise") version "3.16.1"
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.1.17"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

gitHooks {
    preCommit {
        tasks("ktlintCheck")
    }
    commitMsg { conventionalCommits() }
    createHooks()
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}
