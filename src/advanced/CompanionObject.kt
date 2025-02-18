package advanced

class MyClass {

    private constructor()

    /**
     * Companion Object
     * - 클래스 내부에 선언된 싱글톤 객체이다.
     * - Kotlin은 Java와 달리 static 키워드가 없기 때문에 정적 멤버 기능을 사용하고자할 때, 대신 사용할 수 있다.
     * - MyCompanion은 Optional하게 작성할 수 있다.
     */
    companion object MyCompanion {
        val a = 1234

        fun newInstance() = MyClass()

        fun printA() {
            println(a)
        }
    }

}

fun main() {

    MyClass.newInstance()

}