plugins {
    id("java")
}

group = "br.com.blueproject"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    //Spring Cloud config import.
    implementation("org.springframework.cloud:spring-cloud-config-server")
}

ext {
    set("springCloudVersion", "2020.0.3")
}


tasks.test {
    useJUnitPlatform()
}