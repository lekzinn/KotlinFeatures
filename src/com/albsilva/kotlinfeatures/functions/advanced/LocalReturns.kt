package com.albsilva.kotlinfeatures.functions.advanced

public fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun outerFunction() {
    val numbers = 1..100
    numbers.myForEach myLabel@{
        if (it % 5 == 0) {
            return@myLabel
        }
    }
    println("End!")
}

fun main(args: Array<String>) {
    outerFunction()
}