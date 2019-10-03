package com.albsilva.kotlinfeatures.basics

fun main(args: Array<String>) {
    for (a in 1..100) {
        println(a)
    }

    val numbers = 1..100
    for (a in numbers) {
        println(a)
    }

    for (a in 100 downTo 1) {
        println(a)
    }

    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    val capitals = arrayOf("london", "paris", "rome")
    for (capital in capitals) {
        println(capital)
    }

    for ((index, capital) in capitals.withIndex()) {
        println("The index of $capital is $index")
    }

    var x = 100
    while (x > 0) {
        x--
    }

    var y = 100
    do {
        y--
    } while (y > 0)


}