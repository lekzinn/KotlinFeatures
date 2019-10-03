package com.albsilva.kotlinfeatures.basics

fun main(args: Array<String>) {
    var streetNumber: Int
    var streetName: String = "Street Name!"
    streetNumber = 10

    val cep: String = "85807-810"

    var anotherStreetName = "Another Street Name!"

    var myInt = 10

    var myFloat = 10f

    var myHex = 0x10f

    var myBigInt = 1_000_000

    var myAnotherInt: Int = myFloat.toInt()


    val myChar = 'A'
    val myString = "My String!!!"
    val escapeCharacters = "A new Line!\n"

    val rawString = "One" +
            "Two" +
            "Three"

    val multipleLines = """
        First
        Line
        Another        
    """.trimIndent()

    val myAge = 27
    val template = "My age is $myAge"

    val name = "Mary"

    val template2 = "My name is ${name.length}"

}