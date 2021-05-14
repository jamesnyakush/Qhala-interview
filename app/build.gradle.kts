plugins {
    id(BuildPlugins.application)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kapt)
    id(BuildPlugins.safeArgs)
    id(BuildPlugins.hilt)
    id(BuildPlugins.extensions)
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

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        kapt {
            arguments {
                arg("room.schemaLocation", "$projectDir/schemas")
            }
        }
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

        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
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
    annotationProcessor(Libraries.glideCompiler)

    // Room Database
    implementation(Libraries.roomKtx)
    implementation(Libraries.roomRuntime)
    kapt(Libraries.roomCompiler)
}