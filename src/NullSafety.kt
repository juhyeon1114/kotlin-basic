fun main() {

    var a: String? = null // nullable한 변수엔 ?를 붙인다.

    println(a?.length) // 안전 연산자: null이면, null을 반환
    println(a?.length ?: 0) // 엘비스 연산자: 좌측이 null이면, 우측 값으로 대체
    println(a!!.length)  // 단언 연산자: null이 아님을 단언하고 실행

}