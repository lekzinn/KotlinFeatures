package com.albsilva.kotlinfeatures.functions.advanced

infix fun String.shoudBeEqual(value: String) = this == value


fun main(args: Array<String>) {
    val result = "Objective".shoudBeEqual("Objective")
    println(result)
    val output = "Objective"
    output shoudBeEqual "Objective"
}