plugins {
    id("java")
    id("maven-publish") // Добавляем плагин для публикации
}

group = "com.github.SergeiSokolov123" // Убедитесь, что это правильный groupId
version = "1.0.2"

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
