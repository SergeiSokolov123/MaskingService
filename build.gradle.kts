plugins {
    id("java")
    id("maven-publish") // Плагин для публикации
}

group = "com.github.SergeiSokolov123" // Ваш Group ID
version = "1.0.2" // Версия библиотеки

repositories {
    mavenCentral()
}

dependencies {
    // Добавьте любые зависимости, которые нужны библиотеке
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// Конфигурация публикации
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"]) // Экспорт java-компонентов
        }
    }
}
