package advanced

data class Tuple(val a: Int, val b: Int) // 불필요

// 값이 2개 필요한 경우 별도의 클래스를 만들지 않고, Pair를 사용할 수 있다.
fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {

    val plus = plus(Pair(1, 3))
    println(plus)

    val pair2 = Pair(1, 2)
    val component2 = pair2.component2() // componentX() 함수로 Pair의 값을 가져올 수 있다.
    println(component2)

    val toList = pair2.toList() // toList() 함수로 Pair를 List로 변환할 수 있다.

    val triple = Triple(1, 2, 3) // 인자를 3개 갖는 Triple도 있다.
    println(triple.first)
    println(triple.second)
    println(triple.third)

}