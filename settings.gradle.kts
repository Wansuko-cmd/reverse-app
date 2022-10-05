@file:Suppress("UnstableApiUsage")
enableFeaturePreview("VERSION_CATALOGS")
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
rootProject.name = "reverse"

include("domain")

