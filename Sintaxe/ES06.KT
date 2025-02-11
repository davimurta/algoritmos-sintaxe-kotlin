@file:JvmName("JDoodle")

fun main() {
    print("Digite o raio do círculo: ")
    val raio = readLine()?.toDoubleOrNull()

    if (raio != null) {
        val area = 3,14 * raio * raio
        println("A área do círculo é: $area")
    } else {
        println("Por favor, insira um valor válido para o raio.")
    }
}
