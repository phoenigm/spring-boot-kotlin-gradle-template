plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}

repositories {
    mavenCentral()
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
