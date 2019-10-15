package com.albsilva.kotlinfeatures.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun outsideFunction() {
    val number = 10;
    unaryOperation(2) { x -> x * number }
}

fun main(args: Array<String>) {
    println(operation(2, 2, ::sum))
    println(operation(3, 6, { x, y -> x + y }))

    unaryOperation(2, { x -> x * x })
    unaryOperation(2, { it * it })
    unaryOperation(2) {
        it * it
    }

    unaryOperation(2, fun(x: Int): Int { return x * x })
}