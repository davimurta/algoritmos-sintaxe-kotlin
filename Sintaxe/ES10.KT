@file:JvmName("JDoodle")

fun main() {
    print("Digite a temperatura em Celsius: ")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) {
        val fahrenheit = (9.0 / 5.0) * celsius + 32
        println("A temperatura em Fahrenheit é: $fahrenheit°F")
    } else {
        println("Por favor, insira um valor válido para a temperatura em Celsius.")
    }
}
