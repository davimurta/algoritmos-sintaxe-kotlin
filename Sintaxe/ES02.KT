@file:JvmName("JDoodle")
fun main() {
    print("please type a number: ")
    val number = readLine()
    if (number != null) {
        print("Your number is: ")
        println(number)
    } else {
        println("No input received.")
    }
}