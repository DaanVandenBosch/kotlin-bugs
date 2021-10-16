plugins {
    kotlin("js") version "1.5.31"
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
}

dependencies {
    implementation(project(":shared"))
}
