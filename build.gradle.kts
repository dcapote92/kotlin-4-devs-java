plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.angerbytes"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-reflect
    runtimeOnly ("org.jetbrains.kotlin:kotlin-reflect:2.1.10")

    testImplementation(kotlin("test"))
    implementation(kotlin("reflect"))


}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}