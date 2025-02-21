package advanced

val printHello: () -> Unit = { println("Hello") }

fun main() {
    val list = mutableListOf(printHello)
    list[0]()
}