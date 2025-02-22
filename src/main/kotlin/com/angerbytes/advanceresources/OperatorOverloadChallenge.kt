package com.angerbytes.advanceresources

/* Operator Overload Instructions:

Given two Data Classes with two attributes make sum and subtraction, return true if the return is equals
to expected or false if it is not. Use Operator Overload to do that.

Examples:


operator fun plus(other: Coordinates) : Coordinates {
    TODO("not implemented")
}

operator fun minus (other: Coordinates) : Coordinates {
    TODO("not implemented")
}

val p3 = p1 + p2
p3.toString() shouldBeEqualTo "Coordinates(x=1200, y=2100)" // true

val p3 = p1 - p2
p3.toString() shouldBeEqualTo "Coordinates(x=1200, y=2100)" // false
*/

data class TwoValuesClass( var x: Int, var y: Int ){
    operator fun plus(other: TwoValuesClass): TwoValuesClass = TwoValuesClass(x + other.x, y + other.y)
    operator fun minus(other: TwoValuesClass): TwoValuesClass = TwoValuesClass(x - other.x, y - other.y)
}

fun testing(classe: TwoValuesClass ): Boolean {
    return if (classe.toString() == "TwoValuesClass(x=1200, y=2100)") true else false
}

fun main() {
    val tvc1 = TwoValuesClass(200, 100)
    val tvc2 = TwoValuesClass(1000, 2000)

    val tvc3 = tvc1 + tvc2
    val tvc4 = tvc1 - tvc2

    println(tvc3)
    println(tvc4)
    println(testing(tvc3))
    println(testing(tvc4))

}