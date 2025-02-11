@file:JvmName("JDoodle")

fun main() {
    print("Quanto você ganha por hora? ")
    val valorHora = readLine()?.toDoubleOrNull()
    
    print("Quantas horas você trabalhou no mês? ")
    val horasTrabalhadas = readLine()?.toDoubleOrNull()

    if (valorHora != null && horasTrabalhadas != null) {
        val salario = valorHora * horasTrabalhadas
        println("Seu salário no mês é: R$ $salario")
    } else {
        println("Por favor, insira valores válidos para o valor por hora e as horas trabalhadas.")
    }
}