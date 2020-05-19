import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    when (scanner.next()) {
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            print(a * b)
        }
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val s = (a + b + c) * 0.5
            print(sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "circle" -> {
            val r = scanner.nextDouble()
            print(3.14 * r.pow(2.0))
        }
    }
}