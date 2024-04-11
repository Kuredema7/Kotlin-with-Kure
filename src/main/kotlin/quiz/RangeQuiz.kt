package org.example.quiz

fun main() {
    val line = readlnOrNull() ?: throw IllegalStateException()
    println("Elvis says: $line")
}

fun quizOne() {
    // waxaa lagu siin doonaa
    // lambaro isku day inaad doratid
    // kuwa saxan taxanaha ku jira
    val a = 10
    val b = 12
    val range = a..b - 1
}

fun quizTwo() {
    // kasoo qaad lambarada lasoo geliyay iney yihiin
    // sida tan: firstNumber = 20 | secondNumber = 10 | thirdNumber = 30

    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val thirdNumber = readln().toInt()

    val isFirstNumberInRange = firstNumber in secondNumber..thirdNumber
}

fun quizThree() {
    // kasoo qaad in firstRange u dhexeeyo 10 ilaa 20
    // secondRange u dhexeeyo 30 ilaa 40
    // number yahayna 25

    val firstRange = readln().toInt()..readln().toInt()
    val secondRange = readln().toInt()..readln().toInt()
    val number = readln().toInt()

    val isNumberInBothRange = number in firstRange && number in secondRange
}