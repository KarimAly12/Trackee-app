plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("com.google.gms.google-services")
    id ("dagger.hilt.android.plugin")

}

android {
    namespace = "com.example.devicetracking"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.devicetracking"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation ("androidx.compose.material:material-icons-extended:1.6.6")

     implementation ("com.journeyapps:zxing-android-embedded:4.3.0")
//    implementation ("com.google.zxing:core:4.3.0")

    implementation ("com.google.zxing:core:3.2.1")

    implementation ("com.google.android.gms:play-services-code-scanner:16.1.0")

    val hilt_version = "2.48"
    implementation("com.google.dagger:hilt-android:$hilt_version")
    kapt("com.google.dagger:hilt-android-compiler:$hilt_version")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0-rc01")


    val work_version = "2.9.0"
    implementation("androidx.work:work-runtime-ktx:$work_version")

    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("com.google.android.gms:play-services-location:21.1.0")
    implementation("com.google.accompanist:accompanist-permissions:0.35.0-alpha")


    //Google maps
    implementation ("com.google.android.gms:play-services-maps:18.0.2")
    implementation("com.google.maps.android:maps-compose:4.3.3")


    implementation ("com.google.android.gms:play-services-auth:21.1.0")

    implementation(platform("com.google.firebase:firebase-bom:32.8.1"))
    implementation ("com.google.firebase:firebase-auth:22.3.1")
    implementation ("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation ("com.google.android.gms:play-services-auth:21.1.0")
    implementation ("com.google.firebase:firebase-database-ktx:20.3.1")


    //AWS Amplify
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")
    implementation("com.amplifyframework.ui:authenticator:1.2.0")
    implementation ("com.amplifyframework:aws-auth-cognito:2.16.1")
    implementation ("com.amplifyframework:core:2.16.1")
    implementation("com.amplifyframework:aws-api:2.16.1")
    implementation ("com.amplifyframework:aws-datastore:2.16.1")
    implementation("com.amplifyframework:core-kotlin:2.16.1")


}