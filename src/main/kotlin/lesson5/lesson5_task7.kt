package org.example.lesson5

fun main() {

    println("Введите расстояние поездки (в километрах)")
    val tripLength = readln().toFloat()

    println("Введите расход топлива на 100 км (в литрах)")
    val fuelConsumption = readln().toFloat()

    println("Введите текущую цену за литр топлива (в рублях)")
    val fuelLiterPrice = readln().toFloat()


    val fuelNeeded = tripLength * fuelConsumption / 100
    val fuelTripPrice = fuelNeeded * fuelLiterPrice


    println(
        "Для поездки потребуется " + "%.2f".format(fuelNeeded) + " литров топлива, за которые нужно будет заплатить " + "%.2f".format(
            fuelTripPrice
        ) + " рублей"
    )

}