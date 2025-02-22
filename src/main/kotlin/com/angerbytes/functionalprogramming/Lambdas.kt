package com.angerbytes.functionalprogramming

fun main() {
    val students = getStudents()

    val combos = students.map{ a -> "${a.name} : ${a.age}"}
    println("Combos: $combos")

    println("The oldest students is: ${students.maxByOrNull { 
        it.age 
    }}")

    println("Student with longest name is: ${students.filter {
        it.name.length > 5
    }}")
}