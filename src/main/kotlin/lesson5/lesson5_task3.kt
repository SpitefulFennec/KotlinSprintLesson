package org.example.lesson5

fun main() {

    val winningFirstNumber = 15
    val winningSecondNumber = 16

    println("Нужно ввести поочерёдно 2 числа (от 0 до 42) для проверки выигрыша в лотерею.")
    println("Введите первое число:")

    val userFirstNumber = readln().toInt()

    println("Введите второе число:")

    val userSecondNumber = readln().toInt()

    if ((userFirstNumber == winningFirstNumber && userSecondNumber == winningSecondNumber) || (userFirstNumber == winningSecondNumber && userSecondNumber == winningFirstNumber)) {
        println("Вы правильно угадали оба числа и выиграли главный приз!!!")
    } else if ((userFirstNumber == winningFirstNumber) || (userFirstNumber == winningSecondNumber) || (userSecondNumber == winningFirstNumber) || (userSecondNumber == winningSecondNumber)) {
        println("Вы правильно угадали одно из двух чисел и выиграли утешительный приз!")
    } else {
        println("Вы не угадали ни одно из чисел, повезёт в другой раз!")
    }

}