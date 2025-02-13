plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.hyprsync.parser"
version = "0.0.1-DEV"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}