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
val asciidoctorJVersion = "2.3.1"
val asciidoctorDiagramVersion = "2.0.2"

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
            include("index.adoc", "preambule.adoc", "techno.adoc", "base.adoc", "class.adoc", "inheritance.adoc",
                    "modules.adoc", "errors.adoc", "io.adoc", "collections.adoc", "streams.adoc", "conclusion.adoc")
        })
        baseDirFollowsSourceDir()
    }
}

asciidoctorj {
    modules.diagram.version(asciidoctorJVersion)
    modules.diagram.use()
}
