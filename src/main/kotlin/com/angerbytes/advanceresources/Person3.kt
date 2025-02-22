package com.angerbytes.advanceresources

//class Person constructor( firstName: String, lastName: String) {
//class Person ( firstName: String, lastName: String){

@Deprecated("Use the Animal class instead", ReplaceWith("Animal"))
class Person3 internal constructor(firstName: String, lastName: String){
    init{
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)
}