package advanced

class HelloBot {

    /**
     * - by lazy를 통해서 불변 변수의 초기화를 변수가 호출되는 시점으로 늦출 수 있다.
     * - by lazy는 Thread-safe하다.
     */
    val greeting: String by lazy {
        getHello()
    }

    lateinit var text: String

    fun sayHello() {
        println(greeting ?: "Hello")
    }

    fun printText() {
        text = "안녕하세요" // lateinit 변수는 사용하기 위해서는 초기화가 먼저 되어야 한다.
        println(text)
    }

}

fun getHello(): String {
    return "Hello"
}


