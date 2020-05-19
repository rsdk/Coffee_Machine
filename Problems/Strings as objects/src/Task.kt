fun main() {
    var input = readLine()!!
    // write code here
    if (!input.isEmpty()) {

        val symbol = input.first()

        when (symbol) {
            'i' -> {
                val rest = input.drop(1)
                println(rest.toInt() + 1)
            }
            's' -> {
                val rest = input.drop(1)
                println(rest.reversed())
            }
            else -> {
                println(input)
            }

        }
    }
}