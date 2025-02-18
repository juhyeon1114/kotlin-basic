// Kotlin에서는 클래스는 기본적으로 final 클래스이다.
// 'open' 키워드를 사용하면, 상속이 가능해진다.
open class Dog {

    open var age: Int = 1

    open fun bark() {
        println("Bark")
    }

}

class Bulldog(
    override var age: Int = 0,
) : Dog() {

    override fun bark() {
        println("Bark Bark")
    }

}

fun main() {

    val dog = Bulldog(age = 2)
    print(dog.age)
    dog.bark()

}