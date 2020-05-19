class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            when (name) {
                "Moscow" -> field = if (value < -92 || value > 57) 5 else value
                "Hanoi" -> field = if (value < -92 || value > 57) 20 else value
                "Dubai" -> field = if (value < -92 || value > 57) 30 else value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    val minimumCity = if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) firstCity else
        if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees) secondCity else
            if (thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees) thirdCity else City("neither")
    print(minimumCity.name)
}