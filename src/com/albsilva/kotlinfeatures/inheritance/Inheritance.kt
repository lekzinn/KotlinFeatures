package com.albsilva.kotlinfeatures.inheritance

open class Pet(name: String): Any(){
    open fun validate(){}
}

open class Dog(name: String): Pet(name){
    override fun validate(){}
}

data class SuperDog(val name: String) : Dog(name)

fun main(args: Array<String>) {


}