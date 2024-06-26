plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.zakharov.fooddelivery"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.zakharov.fooddelivery"
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
}

dependencies {

    implementation(libs.dagger.android)
    ksp(libs.dagger.compiler)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.bundles.retrofit.moshi)

    implementation(project(mapOf("path" to ":sources:base:network")))
    implementation(project(mapOf("path" to ":sources:base:core")))
    implementation(project(mapOf("path" to ":sources:api:main_screen_api")))
    implementation(project(mapOf("path" to ":sources:features:main_screen")))
    implementation(project(mapOf("path" to ":sources:features:product_details")))
}