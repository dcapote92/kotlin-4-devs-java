package com.angerbytes.poo.interfaces

interface Vehicle {
    val automakerName: String

    fun start(){
        println("Vruuuuuummmm")
    }

    fun stop(){
        println("Brake noise")
    }

    fun getKmPerLiter(): Int{
        return 17
    }

    fun getDoors(): Int
}