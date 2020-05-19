import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextLine()
    val pos = scanner.nextInt()
    println("Symbol # $pos of the string \"$input\" is '${input[pos-1]}'")
}