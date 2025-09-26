package org.example.lesson4

const val SUITABLE_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"

fun main() {

    val isSunnyWeather = true
    val isAwningOpen = true
    val currentHumidity = 20
    val currentSeason = "зима"

    val suitableConditions =
        isSunnyWeather && isAwningOpen && currentHumidity == SUITABLE_HUMIDITY && currentSeason != FORBIDDEN_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $suitableConditions")

}