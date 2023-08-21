plugins {
    kotlin("jvm") version "1.9.0"
}

group = "org.litemn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.qameta.allure:allure-junit-platform:2.23.0")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}