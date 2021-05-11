buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(BuildPlugins.gradleBuildPlugin)
        classpath(BuildPlugins.kotlinBuildPlugin)
        classpath(BuildPlugins.safeArgsGradlePlugin)
        classpath(BuildPlugins.hiltBuildPlugin)

    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete("build")
}
