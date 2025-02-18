package advanced

/**
 * Java의 Record와 유사한 기능을 갖는 클래스
 * - equals(), hashCode(), toString() 메서드를 자동으로 생성
 */
data class Person(
    val name: String,
    val age: Int,
)

fun main() {

    val person1 = Person("홍길동", 20)
    val person2 = Person("홍길동", 20)

    println(person1 == person2) // true

    /**
     * 구조분해할당
     */
    val (name, age) = person1
    println("name: $name, age: $age")
}
