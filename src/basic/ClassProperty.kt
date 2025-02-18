package basic

class Coffee constructor(
    val name: String = "",
    var price: Int = 0,
) {

    var quantity: Int = 0
        set (value) {
            if (value > 0) {
                field = value
            }
        }

}

class EmptyClass

fun main() {

    val coffee = Coffee("아메리카노", 4000)

    coffee.price = 4500 // Setter가 호출 및 사용됨
    coffee.quantity = 1

    println(coffee.name)
    println(coffee.price)
    println(coffee.quantity)

}