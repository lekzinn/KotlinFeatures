package com.albsilva.kotlinfeatures.stdlib

import com.albsilva.kotlinfeatures.classes.PersonKotlin

fun anotherFunction(): Boolean {
    return true;
}


fun anotherFunFunction() = run {
    true
}


fun main(args: Array<String>) {
    // let, run, apply, with, also

    val person = PersonKotlin(1, "Alexandre", "email@at.com")

    println(person)
    val person2 = person.apply {
        name = "Alexandre Silva"
    }.also {
        println(it)
    }
    println(person2)

    with(person){
        // this
    }

    val personNull: PersonKotlin? = null

    personNull?.let {
        // do something!!
        // it!!
    }
}