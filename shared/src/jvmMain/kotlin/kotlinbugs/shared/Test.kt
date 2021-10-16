package kotlinbugs.shared

actual class Test {
    private var x: Int = 0

    actual var prop: Int = 11
        set(value) {
            require(value != 0)
            x = value
            field = value
        }
}
