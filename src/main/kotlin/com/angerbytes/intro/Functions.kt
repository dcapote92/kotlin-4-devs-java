package com.angerbytes.intro

fun main(){
    print("10 + 20 = ${myMathFunction(10, 20)}")
    println()
    print("15 + 25 = ${myMathExpressionBodyFunction(15, 25)}")
    println()
    print("10 + 10 = ${myMathExpressionBodyFunctionWithInference(10, 10)}")
    println()
    print("Default SUM = ${myFunctionWithDefaults()}")


}

fun myMathFunction(number1: Int, number2: Int): Int{
    return number1 + number2
}

fun myMathExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2

fun myMathExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2

fun myFunctionWithDefaults(number1: Int = 1, number2: Int = 5, msg: String = "Hi" ): Int{
    val result = number1 + number2
    println(msg)
    return result
}