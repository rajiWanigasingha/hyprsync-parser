import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("jvm") version "2.0.20"
    alias(libs.plugins.kotlin.serialization.plugin)
    alias(libs.plugins.kotlin.dokka.plugin)
}

group = "com.hyprsync.parser"
version = "0.0.1-DEV"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.serialization)
    implementation(libs.kotlin.logback)
    implementation(libs.kotlin.logging)
    implementation(libs.kotlinx.coroutines.core)

    testImplementation(kotlin("test"))
}


tasks.dokkaHtml {
    outputDirectory.set(rootProject.layout.projectDirectory.dir("documentation/html"))
}

tasks.dokkaGfm {
    outputDirectory.set(rootProject.layout.projectDirectory.dir("documentation/markdown"))
}

tasks.withType<DokkaTask>().configureEach {
    moduleName.set(project.name)
    moduleVersion.set(project.version.toString())

    dokkaSourceSets {
        configureEach {
            documentedVisibilities.set(
                setOf(
                    DokkaConfiguration.Visibility.PUBLIC,
                    DokkaConfiguration.Visibility.INTERNAL,
                    DokkaConfiguration.Visibility.PRIVATE
                )
            )
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}