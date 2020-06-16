repositories {
    jcenter()
}

plugins {
    java
    application
    id("org.asciidoctor.jvm.convert") version "3.1.0"
}

val javaVersion = JavaVersion.VERSION_11
val jUnitVersion = "5.6.2"

configure<JavaPluginConvention> {
    sourceCompatibility = javaVersion
}

application {
    mainClassName = "fr.uvsq.refcardjava.Application"
}

tasks {
    test {
        useJUnitPlatform()
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:$jUnitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jUnitVersion")
}

tasks {
    "asciidoctor"(org.asciidoctor.gradle.jvm.AsciidoctorTask::class) {
        sources(delegateClosureOf<PatternSet> {
            include("base.adoc")
        })
    }
}
