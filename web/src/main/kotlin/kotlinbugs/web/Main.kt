package kotlinbugs.web

import kotlinbugs.shared.Test
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    if (document.body != null) {
        init()
    } else {
        window.addEventListener("DOMContentLoaded", { init() })
    }
}

private fun init() {
    console.log(Test().prop)
}
