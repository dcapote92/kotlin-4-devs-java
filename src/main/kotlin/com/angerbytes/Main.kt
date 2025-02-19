package com.angerbytes

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "Kotlin World"
    println("Hello, $name !!!")

    for(item in 1 ..10){
        print("$item,")
    }

    println()

    var index = 0
    for( item in 10.rangeTo(20).step(2)){
        println("${++index}) $item,")
    }

    println()

    for((indx,item) in 10.rangeTo(20).step(2).withIndex()){
        println("${indx + 1}) $item,")

    }


}

