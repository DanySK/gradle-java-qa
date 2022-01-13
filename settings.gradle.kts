plugins {
    id("com.gradle.enterprise") version "3.8.1"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}

rootProject.name = "gradle-java-qa"
enableFeaturePreview("VERSION_CATALOGS")
