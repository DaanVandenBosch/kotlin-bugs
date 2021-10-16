plugins {
    kotlin("multiplatform") version "1.5.31"
}

kotlin {
    js(IR) {
        browser()
    }

    jvm()
}
