import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val number = scanner.nextInt()
    when  {
        number < 1 -> print("no army")
        number in 1..4 -> print("few")
        number in 5..9 -> print("several")
        number in 10..19 -> print("pack")
        number in 20..49 -> print("lots")
        number in 50..99 -> print("horde")
        number in 100..249 -> print("throng")
        number in 250..499 -> print("swarm")
        number in 500..999 -> print("zounds")
        number > 999 -> print("legion")
    }
}