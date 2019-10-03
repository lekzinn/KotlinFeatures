package com.albsilva.kotlinfeatures.nullsafety

fun returnAString(): String? {
    return null;
}

fun main(args: Array<String>) {
    var message: String? = null

    message = "Message!"

    println(message.length ?: "Default")

    println(message!!.length)

    val result = returnAString()

    println(result?.length ?: "Another Default value")
}