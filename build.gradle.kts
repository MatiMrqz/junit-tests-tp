plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    testImplementation("org.junit.jupiter:junit-jupiter-api:6.0.0")
    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
    testImplementation("org.junit.jupiter:junit-jupiter-engine:6.0.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    implementation("org.projectlombok:lombok:1.18.42")
}

tasks.test {
    useJUnitPlatform()
}