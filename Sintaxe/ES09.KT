@file:JvmName("JDoodle")

fun main() {
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readLine()?.toDoubleOrNull()

    if (fahrenheit != null) {
        val celsius = 5 * (fahrenheit - 32) / 9
        println("A temperatura em Celsius é: $celsius°C")
    } else {
        println("Por favor, insira um valor válido para a temperatura em Fahrenheit.")
    }
}