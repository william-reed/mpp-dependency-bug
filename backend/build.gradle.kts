plugins {
    kotlin("jvm")
    id("application")
}

dependencies {
    implementation(kotlin("stdlib-common"))
    implementation(kotlin("stdlib-jdk8"))

    implementation(project(":common"))
}

application {
    mainClassName = "com.test.foo.ServerKt"
}
