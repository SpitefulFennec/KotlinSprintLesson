package org.example.lesson2

fun main() {

    val sumOfFullTimeEmployees = 50
    val sumOfInterns = 30

    val sumOfEmployees = sumOfFullTimeEmployees + sumOfInterns

    val fullEmployeeSalary = 30000
    val internSalary = 20000

    val paymentForFullEmployees = sumOfFullTimeEmployees * fullEmployeeSalary

    println(paymentForFullEmployees.toInt())

    val paymentForInterns = sumOfInterns * internSalary

    val sumOfPayments = paymentForFullEmployees + paymentForInterns

    println(sumOfPayments.toInt())

    val averageEmployeeSalary = sumOfPayments / sumOfEmployees

    println(averageEmployeeSalary.toInt())

}