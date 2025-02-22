package com.angerbytes.advanceresources

//class Person constructor( firstName: String, lastName: String) {
//class Person ( firstName: String, lastName: String){

data class Person4 internal constructor(var firstName: String, var lastName: String){
    init{
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)
}