package com.albsilva.kotlincourse.basics

fun main(args: Array<String>) {
    // Mutable variable
    var streetNumber: Int
    var streetName: String = "Heitor Baggio Vidal"
    var anotherStreetName = "Heitor Baggio Vidal"

    // Immutable variable
    val cep = "85807-810"

    // Numbers
    val myLong = 10L
    val myFloat = 100f
    val myHex = 0x0f
    val myBinary = 0xb01

    // Explicit conversions
    val anotherInt = 1
    val intNowIsLong: Long = anotherInt.toLong()

    // Underscore
    val underscoreInt = 1_000_000

    // String
    val myChar = 'A'
    val myString = "My String"
    val escapeCharacters = "A new Linke \n"

    val rawString = "Hello" +
            "This is second line" +
            "A third line"

    val multiplesLines = """
        This is a String
        and this is another line
    """

    // String templates
    val years = 10
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}"
}