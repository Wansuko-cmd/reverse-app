plugins {
    kotlin("jvm") version "1.7.10"
}

dependencies {
    implementation(project(":domain"))
    implementation(libs.coroutine)
    testImplementation(libs.bundles.test)
}
