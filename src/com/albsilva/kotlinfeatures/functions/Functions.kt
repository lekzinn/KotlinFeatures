package com.albsilva.kotlinfeatures.functions

import jdk.jfr.Description as Specification
import java.io.BufferedReader
import java.io.FileReader

fun hello(): Unit {
    println("Hello!")
}

fun throwsExceptions(): Nothing {
    throw Exception("Essa funcao lanca uma excecao")
}

fun sum(x: Int, y: Int, w: Int = 0, z: Int = 0) = x + y + w + z

fun square(x: Int) = x * x
fun square(x: Double) = x * x

fun printNumbers(vararg numbers: Int) {
    internalPrintNUmbers(*numbers)
}

fun internalPrintNUmbers(vararg numbers: Int) {
    for (a in numbers) {
        println(a)
    }
}

fun `This is a crazy function`() {
    println("")
}

const val CONFIG_SECRET = "TESTE"

fun main(args: Array<String>) {
    hello()
    sum(1, 2)
    sum(1, 2, 3)
    sum(1, 2, 3, 4)
    sum(1, 2, z = 4)
    sum(1, 2, w = 3)

    square(2)
    square(3.14)

    printNumbers(1, 2, 3, 4, 5, 6)

    `This is a crazy function`()

    val stringBuilder = StringBuilder()

    val buffer = BufferedReader(FileReader("Teste"))
}

@Specification("")
fun testeAnnotation() {
// todo
}