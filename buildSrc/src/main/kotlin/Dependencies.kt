object Versions {
    val min_sdk = 21
    val target_sdk = 29
    val compile_sdk = 29

    val kotlin = "1.4.0"
    val androidx_test = "1.2.0"
    val androidx_test_ext = "1.1.1"
    val android_gradle_plugin = "3.6.3"
    val buildToolsVersion = "29.0.0"
    val junit = "4.13"
    val sqlDelight = "1.4.3"
    val ktor = "1.4.0"
    val stately = "1.1.0"
    val multiplatformSettings = "0.6.1"
    val coroutines = "1.3.9-native-mt"
    val koin = "3.0.1-alpha-2"
    val serialization = "1.0.0"
    val cocoapodsext = "0.11"
    val kermit = "0.1.8"
    val atomicfu = "0.14.3"
    val robolectric = "4.3.1"
    val mokoMvvm = "0.8.0"
    val islandTime = "0.3.0"
    val napier = "1.4.1"
    val krypto = "1.12.0"
    val benasherUuid = "0.2.2"
}

object Deps {
    val app_compat_x = "androidx.appcompat:appcompat:1.1.0"
    val material_x = "com.google.android.material:material:1.1.0"
    val core_ktx = "androidx.core:core-ktx:1.2.0"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    val junit = "junit:junit:${Versions.junit}"
    val stately = "co.touchlab:stately-common:${Versions.stately}"
    val multiplatformSettings = "com.russhwolf:multiplatform-settings:${Versions.multiplatformSettings}"
    val multiplatformSettingsNoArg = "com.russhwolf:multiplatform-settings-no-arg:${Versions.multiplatformSettings}"
    val multiplatformSettingsTest = "com.russhwolf:multiplatform-settings-test:${Versions.multiplatformSettings}"
    val koinCore = "org.koin:koin-core:${Versions.koin}"
    val koinTest = "org.koin:koin-test:${Versions.koin}"
    val cocoapodsext = "co.touchlab:kotlinnativecocoapods:${Versions.cocoapodsext}"
    val kermit = "co.touchlab:kermit:${Versions.kermit}"
    val atomicfu = "org.jetbrains.kotlinx:atomicfu-native:${Versions.atomicfu}"
    val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

    val moko_mvvm = "dev.icerock.moko:mvvm:${Versions.mokoMvvm}"

    val island_time = "io.islandtime:core:${Versions.islandTime}"

    val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"

    object AndroidXTest {
        val core = "androidx.test:core:${Versions.androidx_test}"
        val junit = "androidx.test.ext:junit:${Versions.androidx_test_ext}"
        val runner = "androidx.test:runner:${Versions.androidx_test}"
        val rules = "androidx.test:rules:${Versions.androidx_test}"
    }

    object KotlinTest {
        val common = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        val jvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object Coroutines {
        val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object SqlDelight {
        val gradle = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
        val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
        val runtimeJdk = "com.squareup.sqldelight:runtime-jvm:${Versions.sqlDelight}"
        val driverIos = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        val driverAndroid = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"

        val coroutines_extensions = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
    }

    object Ktor {
        val commonCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        val commonJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        val commonLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        val jvmCore = "io.ktor:ktor-client-core-jvm:${Versions.ktor}"
        val androidCore = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
        val jvmJson = "io.ktor:ktor-client-json-jvm:${Versions.ktor}"
        val jvmLogging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
        val ios = "io.ktor:ktor-client-ios:${Versions.ktor}"
        val iosCore = "io.ktor:ktor-client-core-native:${Versions.ktor}"
        val iosJson = "io.ktor:ktor-client-json-native:${Versions.ktor}"
        val iosLogging = "io.ktor:ktor-client-logging-native:${Versions.ktor}"
        val commonSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        val androidSerialization = "io.ktor:ktor-client-serialization-jvm:${Versions.ktor}"
    }
}
