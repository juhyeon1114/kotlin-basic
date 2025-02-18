package basic

enum class PaymentStatus(
    val label: String
) {
    UNPAID(label = "미지급") {
        override fun isPayable(): Boolean {
            return true
        }
    },
    PAID(label = "지급 완료") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    FAILED(label = "지급 실패") {
        override fun isPayable(): Boolean {
            return false
        }
    },
    REFUNDED(label = "환불") {
        override fun isPayable(): Boolean {
            return false
        }
    };

    abstract fun isPayable(): Boolean

}

fun main() {

    println(PaymentStatus.PAID.label)
    println(PaymentStatus.UNPAID.isPayable())

    val values = PaymentStatus.entries.toTypedArray()
    for (value in values) {
        println(value.name)
        println(value.label)
        println(value.ordinal)
        println()
    }


}
