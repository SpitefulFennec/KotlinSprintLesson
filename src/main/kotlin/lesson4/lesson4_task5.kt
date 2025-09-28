package org.example.lesson4

const val MIN_CREW_SIZE = 55
const val RECOMMENDED_CREW_SIZE = 70
const val MIN_PROVISION_CARGO = 50

fun main() {

    val isShipIntact = false
    val isWeatherFavorable = true
    val crewSize = 69
    val provisionCargo = 50

    val isShipReady =
                (isShipIntact
                && crewSize in MIN_CREW_SIZE..RECOMMENDED_CREW_SIZE
                && provisionCargo > MIN_PROVISION_CARGO)
                || (crewSize == RECOMMENDED_CREW_SIZE
                && isWeatherFavorable
                && provisionCargo >= MIN_PROVISION_CARGO)

    println("Может ли корабль отплыть? $isShipReady")

}