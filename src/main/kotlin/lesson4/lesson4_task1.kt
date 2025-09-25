package org.example.lesson4

const val MAX_NUMBER_OF_TABLES = 13

fun main() {

    val tablesReservedToday = 13
    val tablesReservedTomorrow = 9

    println("[Доступность столиков на сегодня: ${tablesReservedToday < MAX_NUMBER_OF_TABLES}]" +
            "\n[Доступность столиков на завтра: ${tablesReservedTomorrow < MAX_NUMBER_OF_TABLES}]")

}