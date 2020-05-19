import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val c1 = input.next()
    val c2 = input.next()
    println(Currency.findByName(c1).compareCur(Currency.findByName(c2)))
}

enum class Currency(val cur: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    NULL("");

    companion object {
        fun findByName(country: String): Currency {
            for (enum in Currency.values()) {
                if (country == enum.name) return enum
            }
            return NULL
        }
    }

    fun compareCur(curenum: Currency): Boolean {
        return this.cur == curenum.cur
    }

}