package org.example.lesson5

const val AGE_OF_MAJORITY = 18

fun main() {

    val userBirthYear = readln().toInt()
    val currentYear = 2025
    val ageOfUser = currentYear - userBirthYear

    if (ageOfUser >= AGE_OF_MAJORITY) {
        println("Show limited content")
    } else {
        println("Back to main screen")
    }

}