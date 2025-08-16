plugins {
    java
    id("org.danilopianini.gradle-java-qa")
}

dependencies {
    implementation("com.google.guava:guava:31.0.1-jre")
    testImplementation(platform("org.junit:junit-bom:5.13.4"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType<Test>() {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}
