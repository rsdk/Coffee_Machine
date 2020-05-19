import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}

fun isVowel(x: Char): Boolean {
    return x in listOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
}