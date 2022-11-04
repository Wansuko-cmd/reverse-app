plugins {
    kotlin("jvm") version "1.7.10"
    application
    alias(libs.plugins.serialization)
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":usecase"))
    implementation(project(":data"))
    implementation(libs.coroutine)
    implementation(libs.bundles.ktor.client)
    testImplementation(libs.bundles.test)
}

application {
    mainClass.set("MainKt")
}
