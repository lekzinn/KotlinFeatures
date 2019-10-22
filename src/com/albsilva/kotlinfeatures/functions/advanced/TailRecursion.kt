package com.albsilva.kotlinfeatures.functions.advanced

fun factorial(x: Int): Int {
    return when (x) {
        0, 1 -> 1
        else -> x * factorial(x - 1)
    }
}

tailrec fun factorialTR(x: Int, acc: Int = 1): Int {
    return when (x) {
        0 -> acc
        else -> factorialTR(x - 1, x * acc)
    }
}

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))
}