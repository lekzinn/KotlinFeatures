package com.albsilva.kotlinfeatures.inheritance

abstract class Polygon(){
    abstract fun draw()
    open val vertexCount: Int = 0
}

class Rectangle: Polygon(){
    override fun draw() {

    }

    override val vertexCount: Int = 4
}

fun main(args: Array<String>) {
    val rectangle = Rectangle()
    rectangle.draw()
}