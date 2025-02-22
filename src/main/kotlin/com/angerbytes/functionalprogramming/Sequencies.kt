package com.angerbytes.functionalprogramming

import kotlin.time.Duration.Companion.seconds

fun main() {
    var students = getStudents()

    // drop the first and take 3 values
    val sqStudents = students.drop(1).take(3).toList()
    println("Sequence students: $sqStudents")

    // generate a sequence starting from 100, drop the first five and take 20 values
    val numbers = generateSequence(100){it +1}
    println("Numbers: ${numbers.drop(5).take(20).toList()}")

    // generate a sequence starting from 1, mapped to squares ( value * value), filtering by evens
    // and take 5 values
    val squares = generateSequence (1){it + 1  }.map { it * it }
    val evenSquares = squares.filter{it % 2 == 0}
    println("even squares: ${evenSquares.take(5).toList()}")

    // Fibonacci series
    val fibonacci = generateSequence (1 to 1){ it.second to it.first + it.second  }.map{it.first}
    println("Fibonacci: ${fibonacci.take(15).toList()}")


}
