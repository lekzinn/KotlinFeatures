package com.albsilva.kotlinfeatures.inheritance

class Box<T>(t: T){
    var value  = t
}


fun main(args: Array<String>) {
    val boxInt = Box<Int>(1)
    val boxString = Box<String>("My Value")

    val anotherBoxInt = Box(1)
}