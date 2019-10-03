package com.albsilva.kotlinfeatures.tidbits

import java.io.FileReader

class NotANumberException : Throwable()

fun checkIfIsNumber(obj: Any){
    when(obj){
        !is Number, Long, Float -> {
            throw NotANumberException()
        }
    }
}


fun main(args: Array<String>) {
    //val teste = FileReader("teste");

    val resultTryCatch = try{
        checkIfIsNumber(10)
        10
    } catch (e: NotANumberException){
        20
    } finally {
        println("finally")
        30
    }

    println(resultTryCatch)

}