plugins {
    kotlin("jvm") version "2.3.0"
}

group = "com.github.alyssaruth"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-assertions-core:5.5.4")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(25)
}