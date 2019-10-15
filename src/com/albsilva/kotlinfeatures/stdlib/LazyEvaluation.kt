package com.albsilva.kotlinfeatures.stdlib

fun main(args: Array<String>) {

    val range = 1..100000000000
    //val output = range.filter { it < 30 }.map { Pair("yes", it) }
    val output = range.asSequence().filter { it < 30 }.map { Pair("yes", it) }

    output.forEach { println(it) }

    albums.asSequence().filter { it.ranking == 1 }.forEach { album -> println(album.title) }

    val bigJson: String by lazy { "" }

    bigJson.toString() // evaluate!!
}