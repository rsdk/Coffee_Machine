import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.next().first()
    println((input.isLetter() && input.isUpperCase()) || input in '1'..'9')
}