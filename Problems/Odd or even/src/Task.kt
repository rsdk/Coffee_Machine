import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()
    print(if (input % 2 == 0) "EVEN" else "ODD")
}