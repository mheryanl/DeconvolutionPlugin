import org.gradle.api.file.DuplicatesStrategy

plugins {
    java
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://maven.scijava.org/content/repositories/public/") }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
    implementation("net.imagej:imagej:2.16.0")
    implementation("net.imagej:imagej-legacy:2.0.1")
    implementation("net.imagej:ij:1.53k")
}

tasks.processResources {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from("src/main/resources") {
        include("plugins.config")
        into("/")
    }
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.BlindDeconvolution"
    }
    archiveBaseName.set("DeconvolutionPlugin")
}
