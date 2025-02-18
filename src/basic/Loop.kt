package basic

fun main() {

    // 범위 연산자 .. 를 사용한 루프문
    for (i in 1..10) {
        println(i)
    }

    // until (마지막 숫자 제외) 를 사용한 루프문
    for (i in 1 until 10) {
        println(i)
    }

    // step 을 사용한 루프문
    for (i in 1..10 step 2) {
        println(i)
    }

    // downTo 를 사용한 루프문
    for (i in 10 downTo 1) {
        println(i)
    }

    // 배열로 루프문
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }

    // While 루프문
    var x = 5
    while (x > 0) {
        println(x)
        x--
    }

}