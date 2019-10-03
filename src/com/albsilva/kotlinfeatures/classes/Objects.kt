package com.albsilva.kotlinfeatures.classes


object Math{
    val PI = 3.14
}

fun main(args: Array<String>) {

    val MathLocal = object {
        val PI = 3.14
    }

    println(Math.PI)
    println(MathLocal.PI)
}