buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.2")
        classpath(kotlin("gradle-plugin", version = "1.3.61"))
    }
}

extra.set("kodeinVersion", "7.0.0-dev+")