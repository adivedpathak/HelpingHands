// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false


}

buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.2") // or latest version
        classpath("com.google.devtools.ksp:symbol-processing-gradle-plugin:1.9.0-1.0.13")
    }
}
