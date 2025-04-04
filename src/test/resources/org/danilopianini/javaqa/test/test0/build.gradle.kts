plugins {
    java
    id("org.danilopianini.gradle-java-qa")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
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
