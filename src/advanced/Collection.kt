package advanced

import java.util.*

fun main() {

    /**
     * immutable list
     */
    val currencyList = listOf("달러", "유료", "원")

    /**
     * mutable list
     */
    val currencyMutableList = mutableListOf("달러", "유료", "원")
    val currencyMutableList2 = mutableListOf<String>()
    currencyMutableList2.add("달러")
    currencyMutableList2.add("유료")
    currencyMutableList2.add("원")
    val currencyMutableList3 = mutableListOf<String>().apply {
        add("달러")
        add("유료")
        add("원")
    }


    /**
     * immutable set
     */
    val currencySet = setOf("달러", "유료", "원")

    /**
     * mutable set
     */
    val currencyMutableSet = mutableSetOf("달러", "유료", "원")
    val currencyMutableSet2 = mutableSetOf<String>()
    currencyMutableSet2.add("달러")
    currencyMutableSet2.add("유료")
    currencyMutableSet2.add("원")
    val currencyMutableSet3 = mutableSetOf<String>().apply {
        add("달러")
        add("유료")
        add("원")
    }

    /**
     * immutable map
     */
    val currencyMap = mapOf("USD" to "달러", "EUR" to "유료", "KRW" to "원")

    /**
     * mutable map
     */
    val currencyMutableMap = mutableMapOf("USD" to "달러", "EUR" to "유료", "KRW" to "원")
    val currencyMutableMap2 = mutableMapOf<String, String>()
    currencyMutableMap2["USD"] = "달러"
    currencyMutableMap2["EUR"] = "유료"
    currencyMutableMap2["KRW"] = "원"
    val currencyMutableMap3 = mutableMapOf<String, String>().apply {
        this["USD"] = "달러"
        this["EUR"] = "유료"
        this["KRW"] = "원"
    }

    /**
     * 컬렉션 빌더
     */
    val currencyListBuilder = buildList {
        add("달러")
        add("유료")
        add("원")
    }

    /**
     * LinkedList
     */
    val currencyLinkedList = LinkedList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    /**
     * ArrayList
     */
    val currencyArrayList = arrayListOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    /**
     * Iterator
     */
    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    for (currency in currencyList) {
        println(currency)
    }

    currencyList.forEach {
        println(it)
    }

    val map = currencyList.map { currency ->
        if (currency == "달러") {
            return@map "USD"
        } else {
            return@map "KRW"
        }
    }

    val filter = currencyList.filter { currency ->
        currency == "달러"
    }

    /**
     * BAD ❌
     * - filter 함수 마다 새로운 컬렉션을 생성하기 때문에 성능이 좋지 않고, 메모리를 낭비한다.
     */
    currencyList
        .filter { it == "달러" }
        .filter { it == "유료" }
        .filter { it == "원" }

    /**
     * GOOD ✅
     * - asSequence 함수를 사용하여 toList가 호출될 때만 새로운 컬렉션을 생성한다. 이를 통해서 메모리를 절약할 수 있다.
     */
    currencyList
        .asSequence()
        .filter { it == "달러" }
        .filter { it == "유료" }
        .filter { it == "원" }
        .toList()


}