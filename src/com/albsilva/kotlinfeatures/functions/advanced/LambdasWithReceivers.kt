package com.albsilva.kotlinfeatures.functions.advanced

data class Person(var name: String? = null, var age: Int? = null, var address: Address? = null) {
    fun address(block: Address.() -> Unit) {
        address = Address().apply(block)
    }
}

data class Address(var street: String? = null, var city: String? = null)


fun person(block: Person.() -> Unit) = Person().apply(block)

fun main(args: Array<String>) {
    val person = person {
        name = "Alexandre"
        age = 27
        address {
            street = "Aroeira"
            city = "Cascavel"
        }
    }

    println(person)
}