import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    val num1 = arrayListOf<Int>(x1, y1, z1)
    num1.sort()
    val big1 = num1[2]
    val med1 = num1[1]
    val sm1 = num1[0]

    var num2 = arrayListOf<Int>(x2, y2, z2)
    num2.sort()
    val big2 = num2[2]
    val med2 = num2[1]
    val sm2 = num2[0]


    //println("$big1 $med1 $sm1")
    //println("$big2 $med2 $sm2")
    if (big1 == big2 && med1 == med2 && sm1 == sm2) {
        println("Box 1 = Box 2")
    } else if (big1 >= big2 && med1 >= med2 && sm1 >= sm2) {
        println("Box 1 > Box 2")
    } else if (big1 <= big2 && med1 <= med2 && sm1 <= sm2) {
        println("Box 1 < Box 2")
    } else {
        println("Incomparable")
    }
}