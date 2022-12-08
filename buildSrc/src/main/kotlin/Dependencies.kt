object Vers {
    const val kotlin = "1.7.22"

    const val springBoot = "3.0.0"

    const val postgres = "42.5.1"
    const val liquibase = "4.17.2"

    const val jacksonKotlin = "2.14.1"
    const val jaxb = "2.3.1"
    const val swagger = "3.0.0"
}

object Libs {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Vers.kotlin}"
    const val kotlinJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin}"

    const val springTest = "org.springframework.boot:spring-boot-starter-test:${Vers.springBoot}"

    const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Vers.jacksonKotlin}"
    const val postgres = "org.postgresql:postgresql:${Vers.postgres}"
    const val liquibase = "org.liquibase:liquibase-core:${Vers.liquibase}"

    const val jaxb = "javax.xml.bind:jaxb-api:${Vers.jaxb}"
    const val swagger = "io.springfox:springfox-swagger2:${Vers.swagger}"
    const val swaggerUi = "io.springfox:springfox-swagger-ui:${Vers.swagger}"

    const val springWeb = "org.springframework.boot:spring-boot-starter-web:${Vers.springBoot}"

}
