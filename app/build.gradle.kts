plugins {
    id("application") // Исправлено: здесь "application" должен быть отдельным идентификатором
    id("checkstyle") // подключение
}

checkstyle {
    toolVersion = "10.12.4" // Версия Checkstyle
    configFile = file("config/checkstyle/checkstyle.xml") // Путь к конфигурации Checkstyle
}

tasks.withType<Checkstyle>().configureEach {
    reports {
        xml.required.set(true) // Включить XML отчет
        html.required.set(true) // Включить HTML отчет
    }
}

application {
    // Указываем точку входа в приложение
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // Принудительно указал версию
    }
}
