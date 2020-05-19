import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val limit = scanner.nextInt()
    var number: Int = 1

    while (number.toDouble().pow(2).toInt() <= limit) {
        println(number.toDouble().pow(2).toInt())
        number++
    }
}