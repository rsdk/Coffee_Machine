fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(time: Int) {
    var time: Int = 0
        set(value) {
            field = when {
                value < -128 -> -128
                value > 127 -> 127
                else -> value
            }
        }
    init {
        this.time = time
    }

}