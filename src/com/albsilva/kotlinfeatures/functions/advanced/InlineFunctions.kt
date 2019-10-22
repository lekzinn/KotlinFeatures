package com.albsilva.kotlinfeatures.functions.advanced

inline fun operator(op: () -> Unit){
    println("Before Op!")
    op()
    println("After Op!")
    throw RuntimeException("!!!!")
}

inline fun op2(value: Int, op: () -> Unit, noinline op2: () -> Unit){
}

fun main(args: Array<String>) {
    operator { println("This is Operator!") }
}