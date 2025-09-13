package org.example.lesson2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_MINUTE = 60
const val HOURS_IN_DAYS = 24

fun main() {

    val departureHours = 9
    val departureMinutes = 39

    val totalMinutesOfDeparture = departureHours * HOURS_IN_MINUTE + departureMinutes

    val minutesInTrip = 457

    val totalMinutesArrival = totalMinutesOfDeparture + minutesInTrip

    val arrivalMinutes = totalMinutesArrival % MINUTES_IN_HOUR
    val arrivalHours = totalMinutesArrival / MINUTES_IN_HOUR % HOURS_IN_DAYS

    println(String.format("%02d:%02d", arrivalHours, arrivalMinutes))

}