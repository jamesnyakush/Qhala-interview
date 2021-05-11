object Versions {

    const val kotlin = "1.3.72"
    const val buildToolsVersion = "4.0.1"
    const val appcompat = "1.1.0"
    const val constraintlayout = "1.1.3"
    const val support = "1.0.0"
    const val coroutines = "1.3.0"
    const val lifecycle = "2.1.0"
    const val material = "1.1.0"
    const val navigation = "2.3.4"
    const val retrofit = "2.6.0"
    const val timber = "4.7.1"
    const val preference = "1.1.1"
    const val okHttp = "4.10.0-RC1"
    const val hiltVersion = "2.35.1"

    const val junit4 = "4.13.1"
    const val testRunner = "1.1.0"
    const val rules = "1.1.0"
    const val espresso = "3.3.0"
    const val annotation = "1.2.0-alpha01"
    const val mockk = "1.10.2"
    const val kakao = "2.4.0"
    const val archCore = "2.1.0"
    const val core = "1.3.1-alpha02"
    const val fragmentsTesting = "1.3.0-beta01"

}

object BuildPlugins {
    const val gradleBuildPlugin = "com.android.tools.build:gradle:4.1.3"
    const val kotlinBuildPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72"
    const val safeArgsGradlePlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val hiltBuildPlugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"

    const val application = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val hilt = "dagger.hilt.android.plugin"
    const val crashlytics = "com.google.firebase.crashlytics"
    const val safeArgs = "androidx.navigation.safeargs.kotlin"
    const val kapt = "kotlin-kapt"

}

object Libraries {

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core = "androidx.core:core-ktx:1.2.0"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val support = "androidx.legacy:legacy-support-v4:${Versions.support}"

    //Kotlin Coroutines
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

    // ViewModel and LiveData
    const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycle_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    //New Material Design
    const val material = "com.google.android.material:material:${Versions.material}"


    //Android Navigation Architecture
    const val navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"


    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    // Dagger Hilt
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val hiltAndroidCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
//    const val hiltViewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:$hiltAndroidXVersion"
//    const val hiltCompiler = "androidx.hilt:hilt-compiler:$hiltAndroidXVersion"


    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val preference = "androidx.preference:preference-ktx:${Versions.preference}"


}


object AndroidSDK {
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"
}

object TestLibraries {
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test.ext:junit:${Versions.testRunner}"
    const val testRules = "androidx.test:rules:${Versions.rules}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val annotation = "androidx.annotation:annotation:${Versions.annotation}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val archCore = "androidx.arch.core:core-testing:${Versions.archCore}"
    const val core = "androidx.test:core:${Versions.core}"
    const val fragment = "androidx.fragment:fragment-testing:${Versions.fragmentsTesting}"
    const val kakao = "com.agoda.kakao:kakao:${Versions.kakao}"
    const val mockServer = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
}