import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var one = scanner.next().first()
    var two = scanner.next().first()
    var three = scanner.next().first()
    val result = ++one == two && two == --three
    println(result)
}