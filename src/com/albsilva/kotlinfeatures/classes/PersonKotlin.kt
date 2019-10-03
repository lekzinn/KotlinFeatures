package com.albsilva.kotlinfeatures.classes

data class PersonKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }
}

fun main(args: Array<String>) {
    val personKotlin = PersonKotlin(1, "Alexandre", "alexandre@email.at")
    val anotherPerson = PersonKotlin(1, "Alexandre", "alexandre@email.at")

    println(personKotlin)


    if (personKotlin == anotherPerson) {
        println("Equals!!")
    }

    val copyFromPerson = personKotlin.copy(email = "anotherEmail@email.at")
    println(copyFromPerson)
}