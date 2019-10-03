package com.albsilva.kotlinfeatures.basics

fun main(args: Array<String>) {
    val age = 10

    if (age < 10) {
        println("Nao pode assistir o filme")
    } else if (age < 18) {
        println("Pode Assistir o filme com parentes")
    } else {
        println("Pode Assistir o filme")
    }

    val result = if (age < 10) {
        println("Nao pode assistir o filme")
        10
    } else {
        println("Pode Assistir o filme")
        "Teste"
    }

    println(result)

    val resultWhen = when {
        age < 10 -> println("Nao pode assistir o filme")
        age < 18 -> println("Pode Assistir o filme com parentes")
        else -> println("Pode Assistir o filme")
    }

}