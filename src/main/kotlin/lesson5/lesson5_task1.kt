package org.example.lesson5

const val BOT_CHECKUP_MESSAGE = "Для входа в приложение решите пример: "

fun main() {

    val Example = "2 + 2"
    val solvedExample = 2 + 2

    println("$BOT_CHECKUP_MESSAGE$Example")

    val answerToExample = readln().toInt()

    val resultText = if (solvedExample == answerToExample) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещён."
    }
    println(resultText)

}
