plugins {
    kotlin("jvm") version Vers.kotlin
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

subprojects {
    group = "com.example.template"

    repositories {
        mavenCentral()
    }

    tasks {
        withType<Test> {
            useJUnitPlatform()
        }
    }
}
