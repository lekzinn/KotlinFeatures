package com.albsilva.kotlinfeatures.functional

import com.albsilva.kotlinfeatures.classes.PersonJava


fun String.hello() {
    println("Hello!")
}

fun PersonJava.jump() {
    println("${this.name} Jump!!!")
}

fun main(args: Array<String>) {
    val hi = "Hi!"
    hi.hello()

    val person = PersonJava(1, "Alexandre", "albsilva@at.com")
    person.jump()
}