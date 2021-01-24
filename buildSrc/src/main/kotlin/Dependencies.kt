object Vers {
    const val kotlin = "1.4.20"

    const val springBoot = "2.4.2"

    const val postgres = "42.2.18"
    const val postgresR2dbc = "0.8.3.RELEASE"
    const val liquibase = "4.2.2"

    const val reactorTest = "3.4.2"
    const val jacksonKotlin = "2.12.1"
    const val jaxb = "2.3.1"
    const val swagger = "3.0.0"

}

object Libs {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Vers.kotlin}"
    const val kotlinJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin}"

    const val springDataJpa = "org.springframework.boot:spring-boot-starter-data-jpa:${Vers.springBoot}"
    const val springWebflux = "org.springframework.boot:spring-boot-starter-webflux:${Vers.springBoot}"
    const val springConfigProcessor = "org.springframework.boot:spring-boot-configuration-processor:${Vers.springBoot}"

    const val springTest = "org.springframework.boot:spring-boot-starter-test:${Vers.springBoot}"

    const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Vers.jacksonKotlin}"
    const val postgres = "org.postgresql:postgresql:${Vers.postgres}"
    const val postgresR2dbc = "io.r2dbc:r2dbc-postgresql:${Vers.postgresR2dbc}"
    const val liquibase = "org.liquibase:liquibase-core:${Vers.liquibase}"

    const val reactorTest = "io.projectreactor:reactor-test:${Vers.reactorTest}"

    const val jaxb = "javax.xml.bind:jaxb-api:${Vers.jaxb}"
    const val swagger = "io.springfox:springfox-swagger2:${Vers.swagger}"
    const val swaggerWebflux = "io.springfox:springfox-spring-webflux:${Vers.swagger}"
    const val swaggerUi = "io.springfox:springfox-swagger-ui:${Vers.swagger}"

    const val springWeb = "org.springframework.boot:spring-boot-starter-web:${Vers.springBoot}"
    const val springHateoas = "org.springframework.boot:spring-boot-starter-hateoas:${Vers.springBoot}"
    const val springDataRest = "org.springframework.boot:spring-boot-starter-data-rest:${Vers.springBoot}"

}
