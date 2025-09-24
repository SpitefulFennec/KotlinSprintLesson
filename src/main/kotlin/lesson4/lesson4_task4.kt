package org.example.lesson4

const val EVEN_NUMBER_CHECK = 2
const val HANDS_ABS_DAY = 1
const val LEGS_BACK_DAY = 0

fun main() {

    var trainingDay = 5

    val isHandsAbsDay = trainingDay % EVEN_NUMBER_CHECK == HANDS_ABS_DAY
    val isLegsBackDay = trainingDay % EVEN_NUMBER_CHECK == LEGS_BACK_DAY

    println("""
        Упражнения для рук:    $isHandsAbsDay
        Упражнения для ног:    $isLegsBackDay
        Упражнения для спины:  $isLegsBackDay
        Упражнения для пресса: $isHandsAbsDay
    """.trimIndent())

}