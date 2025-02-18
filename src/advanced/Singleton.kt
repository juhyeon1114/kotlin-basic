package advanced

import java.time.LocalDateTime

/**
 * object 키워드를 붙이는 것만으로 싱글톤 객체를 생성할 수 있다.
 */
object SingletonClass {

    val a = 1234

    fun printA() {
        println(a)
    }

}

object DatetimeUtils {

    val now: LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }

}

fun main() {

    SingletonClass.printA()

    println(DatetimeUtils.now)
    println(DatetimeUtils.DEFAULT_FORMAT)
    val now = LocalDateTime.now()
    println(DatetimeUtils.same(now, now))

}