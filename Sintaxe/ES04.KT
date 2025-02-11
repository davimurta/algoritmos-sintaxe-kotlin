@file:JvmName("JDoodle")

fun avg(grade1: Int, grade2: Int, grade3: Int, grade4: Int): Int {
    val total = grade1 + grade2 + grade3 + grade4
    return total / 4
}

fun main() {
    print("Please type the grade 1: ")
    val grade1Input = readLine()
    print("Please type the grade 2: ")
    val grade2Input = readLine()
    print("Please type the grade 3: ")
    val grade3Input = readLine()
    print("Please type the grade 4: ")
    val grade4Input = readLine()

    val grade1 = grade1Input?.toIntOrNull()
    val grade2 = grade2Input?.toIntOrNull()
    val grade3 = grade3Input?.toIntOrNull()
    val grade4 = grade4Input?.toIntOrNull()

    if (grade1 != null && grade2 != null && grade3 != null && grade4 != null) {
        val result = avg(grade1, grade2, grade3, grade4)
        println("The average is: $result")
    } else {
        println("Please enter valid numbers.")
    }
}
