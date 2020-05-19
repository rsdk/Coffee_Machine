import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val limit = scanner.nextInt()

    var counter: Int = 1
    var counter2: Int = 1
    var number: Int = 1

    while (counter <= limit) {
        while (counter <= limit && counter2 <= number) {
            print("$number ")
            counter2++
            counter++
        }
        number++
        counter2 = 1
    }
}