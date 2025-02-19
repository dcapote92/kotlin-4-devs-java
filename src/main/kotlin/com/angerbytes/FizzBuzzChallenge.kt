package com.angerbytes

fun main(){
    println("${fizzBuzz(16)}")
}

fun fizzBuzz(number: Int): List<String>{
    val list: MutableList<String> = mutableListOf()
    for( n in 1..number){
        if(n % 3 == 0 &&  n % 5 ==0) list.add("FizzBuzz") else if(n % 3 == 0 ) list.add("Fizz")
        else if (n % 5 == 0) list.add("Buzz") else list.add(n.toString())
    }
    return list
}