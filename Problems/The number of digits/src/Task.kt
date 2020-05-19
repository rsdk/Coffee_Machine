import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    when (number.toString().length) {
        1 -> print(1)
        2 -> print(2)
        3 -> print(3)
        4 -> print(4)
    }
}