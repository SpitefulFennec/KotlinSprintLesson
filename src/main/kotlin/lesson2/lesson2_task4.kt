package org.example.lesson2

const val TOTAL_PERCENT = 100

fun main() {

    val buffPercentage = 20
    val minedCristalOre = 7
    val minedIronOre = 11

    val buffForMinedCristalOre = minedCristalOre * buffPercentage / TOTAL_PERCENT
    println("ВЫ добыли дополнительно $buffForMinedCristalOre кристальной руды")

    val buffForMinedIronOre = minedIronOre * buffPercentage / TOTAL_PERCENT
    println("Вы добыли дополнительно $buffForMinedIronOre железной руды")

}