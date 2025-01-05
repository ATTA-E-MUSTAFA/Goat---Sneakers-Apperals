//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.google.gms.google.services)
//}
//
//android {
//    namespace = "com.guneet.goat_sneakersapparels"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.guneet.goat_sneakersapparels"
//        minSdk = 24
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//}
//
//dependencies {
//    implementation(platform("com.google.firebase:firebase-bom:33.7.0"))
//    implementation ("com.google.firebase:firebase-auth-ktx")
////    implementation("com.google.firebase:firebase-core")
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)   // This is now using the version specified in toml
//    implementation(libs.androidx.activity)
//    implementation(libs.androidx.constraintlayout)
//    implementation(libs.firebase.database)
////    implementation(libs.mediation.test.suite)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
////    implementation 'androidx.appcompat:appcompat:1.3.1'
//
//}

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
//        id("com.android.application")

        // Add the Google services Gradle plugin
//        id("com.google.gms.google-services")


    }

android {
    namespace = "com.guneet.goat_sneakersapparels"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.guneet.goat_sneakersapparels"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation ("com.github.bumptech.glide:glide:4.15.1")  // Use the latest version
    annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1")
//    implementation ("com.github.bumptech.glide:glide:4.12.0")
//    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation(platform("com.google.firebase:firebase-bom:33.7.0"))  // Firebase BOM
    implementation("com.google.firebase:firebase-auth-ktx")  // Firebase Auth KTX
    // Firebase Database dependency
    implementation("com.google.firebase:firebase-database-ktx:20.0.5")
    // Optional: Firebase Firestore, if used
    // implementation("com.google.firebase:firebase-firestore-ktx:24.3.1")

    // AndroidX libraries
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)  // Material Design library
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.play.services.analytics.impl)

    // Testing dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
