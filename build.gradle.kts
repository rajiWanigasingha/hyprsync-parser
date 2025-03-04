import org.jetbrains.dokka.DokkaConfiguration
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("jvm") version "2.0.20"
    id("maven-publish")
    alias(libs.plugins.kotlin.serialization.plugin)
    alias(libs.plugins.kotlin.dokka.plugin)
}

group = "com.hyprsync.parser"
version = "0.0.1-ALPHA"

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
    outputDirectory.set(rootProject.layout.projectDirectory.dir("documentation"))
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

tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

tasks.register<Jar>("dokkaJar") {
    dependsOn("dokkaHtml")
    archiveClassifier.set("javadoc")
    from(tasks.dokkaHtml)
}


tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

java {
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            artifact(tasks["sourcesJar"])
            artifact(tasks["dokkaJar"])

        }
    }
    repositories {
        maven {
            mavenLocal()
        }
    }
}
