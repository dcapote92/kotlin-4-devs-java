package com.angerbytes.interoperativity

//class Person constructor( firstName: String, lastName: String) {
//class Person ( firstName: String, lastName: String){
class Person2 internal constructor( var firstName: String, var lastName: String){
    init{
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)
}