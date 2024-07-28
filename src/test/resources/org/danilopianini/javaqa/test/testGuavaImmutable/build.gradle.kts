plugins {
    java
    id("org.danilopianini.gradle-java-qa")
}

dependencies {
    implementation("com.google.guava:guava:31.0.1-jre")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.withType<Test>() {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}
