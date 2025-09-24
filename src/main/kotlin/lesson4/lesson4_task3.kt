package org.example.lesson4

const val SUITABLE_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"

fun main() {

    val sunnyWeather = true
    val openTent = true
    val currentHumidity = 20
    val currentSeason = "зима"

    val suitableConditions =
        sunnyWeather && openTent && currentHumidity == SUITABLE_HUMIDITY && currentSeason != FORBIDDEN_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $suitableConditions")

}