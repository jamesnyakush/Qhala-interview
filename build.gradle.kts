buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://maven.google.com")
    }

    dependencies {
        classpath(BuildPlugins.gradleBuildPlugin)
        classpath(BuildPlugins.kotlinBuildPlugin)
        classpath(BuildPlugins.safeArgsGradlePlugin)
        classpath(BuildPlugins.hiltBuildPlugin)
        classpath("org.jacoco:org.jacoco.core:0.8.4")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://maven.google.com")
    }
}

tasks.register("clean").configure {
    delete("build")
}
