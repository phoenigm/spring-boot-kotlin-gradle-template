object Vers {
    const val kotlin = "1.3.61"

    const val springBoot = "2.2.5.RELEASE"
    const val springCloud = "Hoxton.SR1"
    const val springR2dbc = "0.1.0.M3"

    const val postgres = "42.2.9"
    const val postgresR2dbc = "0.8.1.RELEASE"
    const val liquibase = "3.8.5"

    const val reactorTest = "3.3.2.RELEASE"
    const val jacksonKotlin = "2.10.3"
    const val jaxb = "2.3.1"
    const val swagger = "3.0.0-SNAPSHOT"
    const val halExplorer = "3.2.5.RELEASE"
    const val hateoas = "1.0.3.RELEASE"
    const val restDocs = "2.0.4.RELEASE"

    const val springSecurityOauth = "5.3.0.RELEASE"
}

object Libs {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Vers.kotlin}"
    const val kotlinJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin}"

    const val springR2dbc = "org.springframework.boot.experimental:spring-boot-starter-data-r2dbc:${Vers.springR2dbc}"
    const val springDataJpa = "org.springframework.boot:spring-boot-starter-data-jpa:${Vers.springBoot}"
    const val springWebflux = "org.springframework.boot:spring-boot-starter-webflux:${Vers.springBoot}"
    const val springZookeeper = "org.springframework.cloud:spring-cloud-starter-zookeeper-discovery:${Vers.springBoot}"
    const val springMongoDbReactive =
        "org.springframework.boot:spring-boot-starter-data-mongodb-reactive:${Vers.springBoot}"
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
    const val springHalExplorer = "org.springframework.data:spring-data-rest-hal-explorer:${Vers.halExplorer}"
    const val springRestDocs = "org.springframework.restdocs:spring-restdocs-mockmvc:${Vers.restDocs}"

    const val springSecurity = "org.springframework.boot:spring-boot-starter-security:${Vers.springBoot}"
    const val springSecurityAuto =
        "org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:${Vers.springBoot}"
    const val springSecurityOauth =
        "org.springframework.security:spring-security-oauth2-client:${Vers.springSecurityOauth}"
}
