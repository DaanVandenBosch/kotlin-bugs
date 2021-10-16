package kotlinbugs.shared

actual class Test {
    actual var prop: Int
        get() = 7
        set(value) {}
}
