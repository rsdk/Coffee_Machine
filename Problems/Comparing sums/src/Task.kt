import java.util.*

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}

fun isGreater(n1: Int, n2: Int, n3: Int, n4: Int): Boolean {
    return n1 + n2 > n3 + n4
}