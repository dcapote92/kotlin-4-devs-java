package com.angerbytes.intro

fun main(){
    println("${fizzBuzz(16)}")
}

/* FizzBuzz instructions:

Given positive integer `n` implement a function which returns a list numbers from `1` to `100`. However,
for multiples of three list should contain word `Fizz` instead of the number and for the
multiples of five list should contain word `Buzz`. For numbers which are multiples of both three
and five list should contain `FizzBuzz` word.

Examples:
fizzBuzz(5) // [1, 2, "Fizz", 4, "Buzz"]
fizzBuzz(16) // [1, 2, "Fizz", 4, "Buzz", 5, "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16]
*/

fun fizzBuzz(number: Int): List<String>{
    val list: MutableList<String> = mutableListOf()
    for( n in 1..number){
        if(n % 3 == 0 &&  n % 5 ==0) list.add("FizzBuzz") else if(n % 3 == 0 ) list.add("Fizz")
        else if (n % 5 == 0) list.add("Buzz") else list.add(n.toString())
    }
    return list
}