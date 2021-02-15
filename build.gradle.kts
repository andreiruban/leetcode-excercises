plugins {
    kotlin("jvm") version "1.4.30"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
}

group = "io.ruban"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}

configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    version.set("0.40.0")
    debug.set(false)
    verbose.set(true)
    android.set(false)
    outputToConsole.set(true)
    outputColorName.set("RED")
    ignoreFailures.set(true)
    enableExperimentalRules.set(false)
}
