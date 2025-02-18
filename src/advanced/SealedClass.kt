package advanced

/**
 * - sealed 클래스는 추상 클래스이다.
 * - 해당 클래스로 구현된 구현체가 어떤 것들이 있는지 컴파일러가 컴파일 시점에 알 수 있다는 특징을 갖고 있다.
 * - sealed 클래스는 같은 패키지 내에서만 상속이 가능하다.
 */
sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)

}

data class BackendDeveloper(
    override val name: String
) : Developer() {

    override fun code(language: String) {
        println("백엔드 $language")
    }

}

data class FrontendDeveloper(
    override val name: String
) : Developer() {

    override fun code(language: String) {
        println("프론트엔드: $language")
    }

}

object DeveloperPool {

    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) {
        when (developer) {
            is BackendDeveloper -> pool[developer.name] = developer
            is FrontendDeveloper -> pool[developer.name] = developer
//            else -> println("지원하지 않는 개발자")
        }
    }

    fun get(name: String) = pool[name]

}

fun main() {

    val backendDeveloper = BackendDeveloper("김백엔드")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper("김프론트엔드")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("김백엔드"))
    println(DeveloperPool.get("김프론트엔드"))

}