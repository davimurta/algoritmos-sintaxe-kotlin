@file:JvmName("JDoodle")

fun calc(meters: Int): Int {
    val cm = meters * 100
    return cm
}

fun main() {
    print("Please type the meters: ")
    val metersInput = readLine()

    val meters = metersInput?.toIntOrNull()


    if (meters != null) {
        val result = calc(meters)
        println("The conversion: $result")
    } else {
        println("Please enter valid numbers.")
    }
}
