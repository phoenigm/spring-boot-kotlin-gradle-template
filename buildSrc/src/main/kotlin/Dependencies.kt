object Vers {
    const val kotlin = "2.1.20"

    const val springBoot = "3.4.5"

    const val postgres = "42.7.5"
    const val liquibase = "4.31.1"

    const val jacksonKotlin = "2.19.0"
    const val springDoc = "2.8.6"

    const val testContainers = "1.21.0"
    const val junit = "5.12.2"
    const val mockk = "1.14.0"
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
