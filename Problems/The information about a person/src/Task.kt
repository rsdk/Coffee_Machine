import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.nextInt()
    println("${a.first()}. $b, $c years old")
}