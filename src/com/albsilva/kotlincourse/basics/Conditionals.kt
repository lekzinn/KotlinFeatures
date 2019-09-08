package com.albsilva.kotlincourse.basics

fun main(args: Array<String>) {

    // statement if
    val age = 27
    if (age < 10) {
        println("You're too young to watch this movie")
    } else if (age < 13) {
        println("You can watch this movie with a parent")
    } else {
        println("You can watch this movie")
    }

    // if with expression
    val expressionResult = if (age < 10) {
        println("You're too young to watch this movie")
        false
    } else {
        println("You can watch this movie")
        true
    }

    println(expressionResult)

    val canWatchMovie = when {
        age < 10 -> println("You're too young to watch this movie")
        age < 13 -> println("You can watch this movie with a parent")
        else -> println("You can watch this movie")
    }

    println(canWatchMovie)
}