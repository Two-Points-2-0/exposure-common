
buildscript {
    repositories {
        google()
        jcenter()

        mavenCentral()
//        maven(url = "https://dl.bintray.com/kodein-framework/Kodein-DI/org/kodein/di/")

    }
    dependencies {
        classpath(kotlin("gradle-plugin", Versions.kotlin))

        classpath(Deps.android_gradle_plugin)
        classpath(Deps.SqlDelight.gradle)
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}")

        classpath(Deps.cocoapodsext)
        classpath("com.google.gms:google-services:4.3.3") // Google Services plugin

        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.2.2")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
        classpath("com.vanniktech:gradle-maven-publish-plugin:0.13.0")
        // For Kotlin projects, you need to add Dokka.
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.18")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://repo1.maven.org/maven2/")
        maven(url = "https://dl.bintray.com/icerockdev/moko")
        maven(url = "https://dl.bintray.com/florent37/maven")
//        maven(url = "https://dl.bintray.com/kodein-framework/Kodein-DI")
        //maven(url = "https://dl.bintray.com/ekito/koin") TODO: revert when Koin is available
        maven(url = "https://dl.bintray.com/touchlabpublic/kotlin")
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
        mavenLocal()
        maven(url = "https://kotlin.bintray.com/kotlinx")
    }

//    tasks.withType(Test) {
//        testLogging {
//            events = ["failed", "skipped", "passed"]
//            exceptionFormat "full"
//        }
//    }
//
//    if (plugins.hasPlugin("org.jetbrains.kotlin.jvm")) {
//        sourceCompatibility JavaVersion.VERSION_1_8
//                targetCompatibility JavaVersion.VERSION_1_8
//    }
//
//    plugins.withId("com.android.library") {
//        extensions.getByName("android").compileOptions {
//            sourceCompatibility JavaVersion.VERSION_1_8
//                    targetCompatibility JavaVersion.VERSION_1_8
//        }
//    }
//
//    tasks.withType(KotlinCompile) {
//        kotlinOptions {
//            jvmTarget = "1.8"
//        }
//    }
    val GROUP: String by project
    val VERSION_NAME: String by project

    group = GROUP
    version = VERSION_NAME
}