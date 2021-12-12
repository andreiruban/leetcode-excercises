plugins {
    kotlin("jvm") version "1.6.0"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
}

group = "io.ruban"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

// Configuration documentation: https://github.com/JLLeitschuh/ktlint-gradle#configuration
configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    version.set("0.42.1")
    debug.set(false)
    verbose.set(true)
    android.set(false)
    outputToConsole.set(true)
    outputColorName.set("RED")
    ignoreFailures.set(true)
    enableExperimentalRules.set(false)
}
