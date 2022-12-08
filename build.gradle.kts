import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

subprojects {
    group = "com.example.template"

    repositories {
        mavenCentral()
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions.jvmTarget = "17"
            kotlinOptions.allWarningsAsErrors = true
        }

        withType<Test> {
            useJUnitPlatform()
        }
    }
}
