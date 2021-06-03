plugins {
    id(BuildPlugins.application)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kapt)
    id(BuildPlugins.safeArgs)
    id(BuildPlugins.hilt)
    id(BuildPlugins.extensions)
    id("jacoco")
}

android {
    compileSdkVersion(AndroidSDK.targetSdkVersion)
    buildToolsVersion("30.0.3")

    defaultConfig {
        applicationId = "com.qhala"
        minSdkVersion(AndroidSDK.minSdkVersion)
        targetSdkVersion(AndroidSDK.targetSdkVersion)
        versionCode = AndroidSDK.versionCode
        versionName = AndroidSDK.versionName

       // testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        testInstrumentationRunner = "com.qhala.HiltTestRunner"

        kapt {
            arguments {
                arg("room.schemaLocation", "$projectDir/schemas")
            }
        }

        ndkVersion = "22.1.7171670"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            //testCoverageEnabled =true
        }
    }

    externalNativeBuild {
        cmake {
            path("CMakeLists.txt")
        }
    }

    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
        animationsDisabled = true
        unitTests.apply {
            isReturnDefaultValues = true
            isIncludeAndroidResources = true
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Libraries.kotlin)
    api(Libraries.appcompat)
    api(Libraries.core)
    api(Libraries.constraintlayout)
    api(Libraries.support)


    //Kotlin Coroutines
    implementation(Libraries.coroutines_android)
    implementation(Libraries.coroutines_core)

    // ViewModel and LiveData
    api(Libraries.lifecycle_extensions)
    api(Libraries.lifecycle_viewmodel)
    api(Libraries.livedata)

    //New Material Design
    api(Libraries.material)


    //Android Navigation Architecture
    api(Libraries.navigation_fragment)
    api(Libraries.navigation_ui)

    // Retrofit For Network Calls
    implementation(Libraries.retrofit)
    implementation(Libraries.converter_gson)

    // Dagger Hilt
    implementation(Libraries.hiltAndroid)
    kapt(Libraries.hiltAndroidCompiler)

    // Timber For Logging
    api(Libraries.timber)

    api(Libraries.datastore)

    // Glide
    implementation(Libraries.glide)
    kapt(Libraries.glideCompiler)

    // Room Database
    implementation(Libraries.roomKtx)
    implementation(Libraries.roomRuntime)
    kapt(Libraries.roomCompiler)

    // UI Tests
    androidTestImplementation(TestLibraries.espresso)
    androidTestImplementation(TestLibraries.kakao)

    // Instrumentation Tests
    androidTestImplementation(TestLibraries.runner)
    androidTestImplementation(TestLibraries.rules)
    androidTestImplementation(TestLibraries.androidXJUnit)
    androidTestImplementation(TestLibraries.androidXTestCore)
    androidTestImplementation(TestLibraries.androidMockK)
    androidTestImplementation(TestLibraries.hiltAndroidTesting)
    kaptAndroidTest(TestLibraries.hiltAndroidCompiler)

    // Unit Tests
    testImplementation(TestLibraries.jUnit)
    testImplementation(TestLibraries.roomTest)
    testImplementation(TestLibraries.mockK)
    testImplementation(TestLibraries.mockWebServer)
    testImplementation(TestLibraries.roboelectric)
    testImplementation(TestLibraries.truth)
    testImplementation(TestLibraries.runner)
    testImplementation(TestLibraries.androidXJUnit)
    testImplementation(TestLibraries.coroutinesTest)
    testImplementation(TestLibraries.archComponentTest)
    testImplementation(TestLibraries.liveDataTesting)
    testImplementation(TestLibraries.hiltAndroidTesting)
    kaptTest(TestLibraries.hiltAndroidCompiler)


    debugImplementation(TestLibraries.fragment)
}

task<JacocoReport>("mergedJacocoReport") {
    dependsOn("testDebugUnitTest", "createDebugCoverageReport")

    reports {
        xml.isEnabled = false
        html.isEnabled = false
    }

    val fileFilter = mutableSetOf(
        "**/R.class",
        "**/R\$*.class",
        "**/BuildConfig.*",
        "**/Manifest*.*",
        "**/*Test*.*",
        "android/**/*.*",
        "**/*\$Lambda$*.*", // Jacoco can not handle several "$" in class name.
        "**/*\$inlined$*.*" // Kotlin specific, Jacoco can not handle several "$" in class name.
    )

    classDirectories.setFrom(
        fileTree(project.buildDir) {
            include(
                "**/classes/**/main/**",
                "**/intermediates/classes/debug/**",
                "**/intermediates/javac/debug/*/classes/**", // Android Gradle Plugin 3.2.x support.
                "**/tmp/kotlin-classes/debug/**"
            )

            exclude(fileFilter)
        }
    )

    sourceDirectories.setFrom(
        fileTree("${project.buildDir}") {
            include(
                "src/main/java/**",
                "src/main/kotlin/**",
                "src/debug/java/**",
                "src/debug/kotlin/**"
            )
        }
    )

    executionData.setFrom(
        fileTree(project.buildDir) {
            include(
                "outputs/code_coverage/**/*.ec",
                "jacoco/jacocoTestReportDebug.exec",
                "jacoco/testDebugUnitTest.exec",
                "jacoco/test.exec"
            )
        }
    )
}

kapt {
    correctErrorTypes = true
}