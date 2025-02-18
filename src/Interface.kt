class Product(val name: String, val price: Int)

interface Cart {

    var coin: Int
    val weight: String
        get() = "20kg"

    fun add(product: Product)

    fun rent() {
        if (coin > 0) {

        }
    }

}

class MyCart(override var coin: Int) : Cart {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("상품을 추가합니다")
    }

    override fun rent() {
        println("Rent")
    }

}

fun main() {

    val cart = MyCart(coin = 100)
    cart.rent()
    cart.add(Product(name = "Macbook", price = 2000))

}