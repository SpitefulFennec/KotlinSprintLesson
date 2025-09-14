package org.example.lesson2

fun main() {

    val scoreStudentOne = 3.0
    val scoreStudentTwo = 4.0
    val scoreStudentThree = 3.0
    val scoreStudentFour = 5.0

    val numberOfStudents = 4

    val arithmeticMeanScore = (scoreStudentOne + scoreStudentTwo + scoreStudentThree + scoreStudentFour) / numberOfStudents

    print(String.format("%.2f", arithmeticMeanScore))

}