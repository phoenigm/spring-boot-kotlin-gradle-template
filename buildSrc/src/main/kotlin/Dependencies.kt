object Vers {
    const val kotlin = "1.8.20"

    const val springBoot = "3.0.6"

    const val postgres = "42.6.0"
    const val liquibase = "4.21.1"

    const val jacksonKotlin = "2.15.0"
    const val springDoc = "2.1.0"

    const val testContainers = "1.18.0"
    const val junit = "5.9.3"
    const val mockk = "1.13.5"
}

object Libs {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Vers.kotlin}"

    const val springTest = "org.springframework.boot:spring-boot-starter-test:${Vers.springBoot}"

    const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Vers.jacksonKotlin}"
    const val postgres = "org.postgresql:postgresql:${Vers.postgres}"
    const val liquibase = "org.liquibase:liquibase-core:${Vers.liquibase}"

    const val springDoc = "org.springdoc:springdoc-openapi-starter-webmvc-ui:${Vers.springDoc}"

    const val springWeb = "org.springframework.boot:spring-boot-starter-web:${Vers.springBoot}"
    const val springValidation = "org.springframework.boot:spring-boot-starter-validation:${Vers.springBoot}"

    const val testContainers = "org.testcontainers:testcontainers:${Vers.testContainers}"
    const val testContainersPostgres = "org.testcontainers:postgresql:${Vers.testContainers}"
    const val junit = "org.junit.jupiter:junit-jupiter-api:${Vers.junit}"
    const val mockk = "io.mockk:mockk:${Vers.mockk}"
}
