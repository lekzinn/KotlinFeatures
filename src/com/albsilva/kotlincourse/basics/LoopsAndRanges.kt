package com.albsilva.kotlincourse.basics

fun main(args: Array<String>) {
    // For Loops
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

    for (b in 100 downTo 1 step 5) {
        println(b)
    }

    val capitals = listOf("London", "Paris", "Rome", "Madri")
    for (capital in capitals) {
        println(capital)
    }

    for ((index, capital) in capitals.withIndex()) {
        println("the capital at $index is $capital")
    }

    // while
    var i = 100
    while (i > 0) {
        i--
    }

    // do while
    var x = 1
    do {
        x++
    } while (x < 10)


    // continue and break
    outer@ for (n in 2..100) {
        for (d in 2 until n) {
            if (n % d == 0) continue@outer
        }
        println("$n is prime")
    }
}