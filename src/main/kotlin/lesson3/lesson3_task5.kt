package org.example.lesson3

fun main() {

    val chessMoveInfo = "D2-D4:0"

    val (moveFrom, moveTo, moveNumber) = chessMoveInfo.split("-", ":")

    println(moveFrom)
    println(moveTo)
    println(moveNumber)

}