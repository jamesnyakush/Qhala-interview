object Versions {
    const val kotlin = "1.3.72"
    const val buildToolsVersion = "4.0.1"
    const val appcompat = "1.1.0"
    const val constraintlayout = "1.1.3"
    const val support = "1.0.0"
    const val coroutines = "1.3.0"
    const val lifecycle = "2.1.0"
    const val livedata = "2.2.0"
    const val material = "1.1.0"
    const val navigation = "2.3.4"
    const val retrofit = "2.6.0"
    const val timber = "4.7.1"
    const val preference = "1.0.0-alpha05"
    const val hiltVersion = "2.35.1"
    const val glide = "4.12.0"
    const val room = "2.2.5"

    // tests
    const val junit = "4.13"
    const val junitTest = "1.1.2"
    const val espresso = "3.3.0"
    const val roboelectric = "4.4-beta-1"
    const val androidXJUnit = "1.1.1"
    const val truth = "1.0.1"
    const val mockWebServer = "4.8.1"
    const val androidXTestCore = "1.3.0"
    const val runner = "1.3.0"
    const val rules = "1.3.0"
    const val archComponentTest = "2.1.0"
    const val kakao = "2.3.4"
    const val mockK = "1.10.0"
    const val liveDataTesting = "1.1.2"
    const val fragmentTesting = "1.3.3"

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
    const val extensions = "kotlin-android-extensions"

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
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.livedata}"

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

    //Timber For Logging
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val datastore = "androidx.datastore:datastore-preferences:${Versions.preference}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

}

object TestLibraries {
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val jUnit = "junit:junit:${Versions.junit}"
    const val jUnitTest = "androidx.test.ext:junit:${Versions.junitTest}"
    const val roboelectric = "org.robolectric:robolectric:${Versions.roboelectric}"
    const val androidXJUnit = "androidx.test.ext:junit:${Versions.androidXJUnit}"
    const val truth = "com.google.truth:truth:${Versions.truth}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"
    const val androidXTestCore = "androidx.test:core:${Versions.androidXTestCore}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val rules = "androidx.test:rules:${Versions.rules}"
    const val roomTest = "androidx.room:room-testing:${Versions.room}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val archComponentTest =
        "androidx.arch.core:core-testing:${Versions.archComponentTest}"
    const val kakao = "com.agoda.kakao:kakao:${Versions.kakao}"
    const val mockK = "io.mockk:mockk:${Versions.mockK}"
    const val androidMockK = "io.mockk:mockk-android:${Versions.mockK}"
    const val liveDataTesting = "com.jraska.livedata:testing-ktx:${Versions.liveDataTesting}"
    const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:${Versions.hiltVersion}"
    const val hiltAndroidCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"

    const val  fragment = "androidx.fragment:fragment-testing:${Versions.fragmentTesting}"
}


object AndroidSDK {
    const val minSdkVersion = 26
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"
}