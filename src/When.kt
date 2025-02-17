fun main() {

    val day = 2

    val result = when (day) {
        0, 1 -> println("월요일")
        2 -> println("화요일")
        3 -> println("수요일")
        4 -> println("목요일")
        5 -> println("금요일")
        6 -> println("토요일")
        7 -> println("일요일")
        else -> println("알 수 없는 요일") // else 블록은 생략 가능
    }

    println(result)

}