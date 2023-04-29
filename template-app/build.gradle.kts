plugins {
    kotlin("jvm")
    id("org.springframework.boot") version Vers.springBoot
}

dependencies {
    implementation(Libs.kotlinStdlib)
    implementation(Libs.kotlinReflect)

    implementation(Libs.springDoc)
    implementation(Libs.jacksonKotlin)

    implementation(Libs.springWeb)

    testImplementation(Libs.springTest) {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }

    testImplementation(Libs.junit)
    testImplementation(Libs.mockk)
    testImplementation(Libs.testContainers)
    testImplementation(Libs.testContainersPostgres)
}
