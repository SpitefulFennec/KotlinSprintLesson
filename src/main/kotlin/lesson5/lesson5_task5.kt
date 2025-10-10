package org.example.lesson5

fun main() {

    println("Добро пожаловать в лотерею!")

    val randomNumbers = (0..42).shuffled().take(3)

    println("Системе загадала 3 числа от 0 до 42, попробуйте их отгадать!")

    println("Введите первое число:")
    val userFirstNumber = readln().toInt()
    println("Введите второе число:")
    val userSecondNumber = readln().toInt()
    println("Введите третье число:")
    val userThirdNumber = readln().toInt()

    val userNumbers = listOf(userFirstNumber, userSecondNumber, userThirdNumber)

    val guessedNumbers = userNumbers.intersect(randomNumbers).size

    println("Загаданными числами были: $randomNumbers")

    when (guessedNumbers) {
        3 -> println("Вы угадали $guessedNumbers из всех чисел и выиграли джекпот!")
        2 -> println("Вы угадали $guessedNumbers из всех чисел и выиграли крупный приз!")
        1 -> println("Вы угадали $guessedNumbers из всех чисел и выиграли утешительный приз!")
        0 -> println("Вы угадали $guessedNumbers из всех чисел и выиграли наши поздравления!")
        else -> println("Неожиданный результат!")
    }

}