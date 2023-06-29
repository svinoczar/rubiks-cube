plugins {
    kotlin("jvm") version "1.8.10"
    id("org.jetbrains.dokka") version "1.8.20"
    application
}

group = "me.svinoczar.rubics"
version = "1.0-SNAPSHOT"

val kotlinVersion = "1.8.10"
val koinVersion = "3.2.2"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.5.20")
    implementation("io.insert-koin:koin-core:$koinVersion")
    implementation("org.reflections:reflections:0.10.2")
    implementation ("org.jetbrains.kotlin:kotlin-reflect:1.5.20")
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