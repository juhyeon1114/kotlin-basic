package basic

// 기본
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식 스타일
fun sum2(a: Int, b: Int): Int = a + b

// 표현식 스타일 (반환 타입 생략)
fun sum3(a: Int, b: Int) = a + b

// 반환 타입이 없는 함수는 Unit을 반환
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// 초기값 설정
fun greeting(message: String = "Hello") {
    println(message)
}

// Named Arguments
fun log(level: String = "INFO", message: String) {
    println("[$level] $message")
}

fun main() {
    log(message = "인포 로그")
    log(level = "WARN", message = "워닝 로그")
    log(message = "에러 로그", level = "ERROR")
    log("DEBUG", "디버그 로그")
}