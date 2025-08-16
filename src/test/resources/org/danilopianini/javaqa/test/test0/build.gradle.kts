plugins {
    java
    id("org.danilopianini.gradle-java-qa")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.13.4"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

javaQA {
    javaVersion = 21
}

tasks.withType<Test>() {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}
