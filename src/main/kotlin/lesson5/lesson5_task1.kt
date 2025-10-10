package org.example.lesson5

const val BOT_CHECKUP_MESSAGE = "Для входа в приложение решите пример: "

fun main() {

    val firstNumberInExample = 2
    val secondNumberInExample = 2

    val Example = "$firstNumberInExample + $secondNumberInExample"
    val solvedExample = firstNumberInExample + secondNumberInExample

    println("$BOT_CHECKUP_MESSAGE$Example")

    val answerToExample = readln().toInt()

    val resultText = if (solvedExample == answerToExample) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещён."
    }
    println(resultText)

}
