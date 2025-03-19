plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.navigation.safe.args)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.org.jetbrains.kotlin.kapt)
}

android {
    namespace = "com.example.challenge"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.challenge"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            buildConfigField("String", "BASE_URL", "\"https://run.mocky.io/v3/\"")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "BASE_URL", "\"https://run.mocky.io/v3/\"")

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
        buildConfig = true
    }
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)

    implementation(libs.retrofit)
    implementation(libs.converter.moshi)
    implementation(libs.okhttp.logging.interceptor)

    implementation(libs.moshi)
    implementation(libs.moshi.kotlin)

    implementation(libs.datastore.preferences)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.glide)
}