package advanced

/**
 * 확장하고자 하는 메서드 또는 변수를 선언하고, 해당 메서드 또는 변수를 재정의할 수 있다.
 */
fun String.first(): Char {
    return this[0]
}