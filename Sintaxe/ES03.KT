@file:JvmName("JDoodle")

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun main() {
    print("Please type the number 1: ")
    val input1 = readLine()
    print("Please type the number 2: ")
    val input2 = readLine()

    val number1 = input1?.toIntOrNull()
    val number2 = input2?.toIntOrNull()

    if (number1 != null && number2 != null) {
        val result = sum(number1, number2)
        println("The sum is: $result")
    } else {
        println("Please enter valid numbers.")
    }
}