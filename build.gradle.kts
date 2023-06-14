plugins {
    kotlin("jvm") version "1.8.0"
    id("org.jetbrains.dokka") version "1.8.20"
    application
}

group = "me.svinoczar.rubics"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}