package org.example.lesson5

const val CM_TO_M = 100

const val UNDERWEIGHT = 18.5
const val OVERWEIGHT = 25.0
const val OBESE = 30.0

fun main() {

    println("Введите свой рост в сантиметрах")
    val height = readln().toDouble() / CM_TO_M

    println("Введите свой вес в килограммах")
    val weight = readln().toFloat()

    val imt = weight / (height * height)

    if (imt < UNDERWEIGHT) {
        println("Недостаточная масса тела. Ваш IMT: " + "%.2f".format(imt))
    } else if (imt > UNDERWEIGHT && imt < OVERWEIGHT) {
        println("Нормальная масса тела. Ваш IMT: " + "%.2f".format(imt))
    } else if (imt > OVERWEIGHT && imt < OBESE) {
        println("Избыточная масса тела. Ваш IMT: " + "%.2f".format(imt))
    } else println("Ожирение. Ваш IMT: " + "%.2f".format(imt))
}