plugins {
    kotlin("jvm")
    alias(libs.plugins.spring.boot)
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlin.reflect)

    implementation(libs.springdoc.openapi)
    implementation(libs.jackson.kotlin)

    implementation(libs.spring.web)
    implementation(libs.spring.validation)

    testImplementation(libs.spring.test) {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }

    testRuntimeOnly(libs.junit.platform.launcher)
    testImplementation(libs.junit)
    testImplementation(libs.mockk)
    testImplementation(libs.testcontainers)
    testImplementation(libs.testcontainers.postgres)
}