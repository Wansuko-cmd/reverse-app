plugins {
    kotlin("jvm") version "1.7.10"
}

dependencies {
    implementation(project(":domain"))
    testImplementation(libs.bundles.test)
}