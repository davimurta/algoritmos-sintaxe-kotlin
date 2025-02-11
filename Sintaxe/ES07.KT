@file:JvmName("JDoodle")

fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()?.toDoubleOrNull()

    if (lado != null) {
        val area = lado * lado
        val dobroArea = area * 2
        println("A área do quadrado é: $area")
        println("O dobro da área é: $dobroArea")
    } else {
        println("Por favor, insira um valor válido para o lado.")
    }
}
