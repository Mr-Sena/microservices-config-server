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

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.3.1")

    //Spring Cloud config import.
    implementation("org.springframework.cloud:spring-cloud-config-server:3.1.3")
}



tasks.test {
    useJUnitPlatform()
}