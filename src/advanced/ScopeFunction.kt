package advanced

class DatabaseClient {

    var url: String? = null
    var userName: String? = null
    var password: String? = null

    fun connect(): Boolean {
        println("DB 접속")
        Thread.sleep(500)
        println("DB 접속 완료")
        return true
    }

}

class User(val name: String, val password: String) {

    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()) {
            println("검증 성공")
        } else {
            println("검증 실패")
        }
    }

}

fun main() {
    /**
     * let
     * - 값이 null이 아닌 경우에만 실행
     */
    var str: String? = "안녕"
    val result = str?.let {
        println(it)
        1234
    }
    println(result)

    /**
     * run
     * - let과 동일하게 동작하지만, 차이점은 아래와 같다.
     * - scope 안에서는 it 대신 this를 사용한다.
     * - 값이 null이 아니여도 실행된다.
     */
//    val dbClient = DatabaseClient()
//    dbClient.url = "http://localhost:8080"
//    dbClient.userName = "admin"
//    dbClient.password = "admin"
//    val connected = dbClient.connect()

    val connected = DatabaseClient().run {
        url = "http://localhost:8080"
        userName = "admin"
        this.password = "admin" // this 생략 가능
        connect()
    }
    println(connected)

    /**
     * with
     * - run과 동일하게 동작하지만, 차이점은 아래와 같다.
     * - run, let과 달리 확장함수의 형태가 아닌, 별도의 함수로 사용할 수 있다.
     */
    var str2 = "안녕하세요"
    with(str2) {
        println("문자열 길이: $length")
    }

    /**
     * apply
     * - run과 유사하며, 반환타입이 함수 마지막에 나오는 값이 아닌 객체 자신이다.
     */
    val client = DatabaseClient().apply {
        url = "http://localhost:8080"
        userName = "admin"
        password = "admin"
        connect()
    }
    println(client)

    /**
     * also
     * - 부수 작업을 수행하며, 수신 객체를 결과로 반환받고 싶을 때 사용한다.
     */
    val user = User("admin", "admin").also {
        it.validate()
    }

}