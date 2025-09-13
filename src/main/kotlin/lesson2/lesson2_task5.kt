package org.example.lesson2

import kotlin.math.pow

/*
Формула сложного процента для расчета итоговой суммы: A = P × (1 + r/n)^(n×t),
где A — итоговая сумма, P — начальная сумма, r — годовая процентная ставка,
n — количество периодов начисления процентов в год, а t — срок в годах.
*/

fun main() {

    val depositAmount = 70_000
    val interestRate = 0.167
    val frequencyOfAccrualsPerYear = 1
    val depositTermInYears = 20

    val compoundInterestFormula =
        depositAmount * (1 + interestRate * frequencyOfAccrualsPerYear).pow(frequencyOfAccrualsPerYear * depositTermInYears)

    println(String.format("%.3f", compoundInterestFormula))

}