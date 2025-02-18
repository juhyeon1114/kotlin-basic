package advanced

class MyGeneric<T>(val t: T) {

}

fun main() {

    val generic = MyGeneric<String>("Hello")

}