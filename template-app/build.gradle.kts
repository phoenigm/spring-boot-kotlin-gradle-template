plugins {
    kotlin("jvm")
    id("org.springframework.boot") version Vers.springBoot
}

dependencies {
    implementation(Libs.kotlinStdlib)
    implementation(Libs.kotlinReflect)
    implementation(Libs.kotlinJdk8)
    runtimeOnly(Libs.jaxb)

    implementation(Libs.swagger)
    implementation(Libs.swaggerUi)
    implementation(Libs.jacksonKotlin)

    implementation(Libs.springWeb)

    testImplementation(Libs.springTest) {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }
}
