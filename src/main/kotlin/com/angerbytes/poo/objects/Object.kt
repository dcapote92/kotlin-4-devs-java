package com.angerbytes.poo.objects

fun main() {

    // Object type
    val location1 = object{
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    //Object type
    val location2 = object{
        var xCoordinate = 300
        var yCoordinate = 600
        fun printIt() = println("Coordinates = ($xCoordinate, $yCoordinate)")
    }

    location2.printIt()

    location2.xCoordinate = 3000
    location2.yCoordinate = 6000

    location2.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last temperature measured = $temperature degrees!")
}

// Object declaration
object MySingleton{
    private var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}