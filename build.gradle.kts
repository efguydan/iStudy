// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlin_version by extra("1.4.21")
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
        mavenCentral()
    }

    dependencies {
        classpath(Config.Plugins.gradle)
        classpath(Config.Plugins.kotlin)
        classpath(Config.Plugins.safeArgs)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
        mavenCentral()
    }
}

tasks.register("clean",Delete::class) {
    delete(rootProject.buildDir)
}