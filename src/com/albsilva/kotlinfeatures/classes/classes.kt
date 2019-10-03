package com.albsilva.kotlinfeatures.classes

import java.lang.IllegalArgumentException
import java.util.*

class Customer(val id: Int, var name: String, val yearOfBirthday: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirthday

    var email: String = ""
        set(value){
            if(!value.contains("@")){
                throw  IllegalArgumentException("Email invalid")
            }
            field = value
        }

    init {
        name = name.toUpperCase()
    }

    constructor(_name: String) : this(0, "Nome Default", 1992) {
        name = _name
    }

    fun canDrinkBeer(): Boolean{
        return age >= 18
    }
}

fun main(args: Array<String>) {
    val customer = Customer(1, "Alexandre", 1992)
    val customer2 = Customer("Alexandre")
    //customer.name = "Alexandre Silva"
    println(customer.id)
    println(customer.name)
    println(customer.age)

    customer.email = "alexandre@mail.at"
    println(customer.email)

    println(customer.canDrinkBeer())
}