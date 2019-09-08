package com.albsilva.kotlincourse.functions

import java.lang.Exception

fun hello(): Unit {
    println("Hello")
}

fun trowException(): Nothing {
    throw  Exception("This fun throw a exception")
}

fun sum(x: Int, y: Int, w: Int = 0, z: Int = 0) = x + y + w + z

fun square(number: Int) = number * number
fun square(number: Double) = number * number

fun `This is Crazy!`() {
    println("This is Crazy!")
}

fun main(args: Array<String>) {
    hello()
    sum(2, 2)
    sum(2, 2, 3)
    sum(2, 3, 4, 6)
    sum(2, 2, w = 5)
    sum(2, 2, z = 3)

    square(4)    // Calls the first function; result is 16 (Int)
    square(3.14) // Calls the second function; result is 9.8596 (Double)

    `This is Crazy!`()
}