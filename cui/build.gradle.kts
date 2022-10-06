plugins {
    kotlin("jvm") version "1.7.10"
    application
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":usecase"))
    implementation(libs.coroutine)
    testImplementation(libs.bundles.test)
}

application {
    mainClass.set("MainKt")
}
