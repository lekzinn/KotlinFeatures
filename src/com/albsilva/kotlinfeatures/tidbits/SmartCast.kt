package com.albsilva.kotlinfeatures.tidbits

import com.albsilva.kotlinfeatures.inheritance.Polygon


class Square : Polygon(){
    override fun draw() {
    }

    fun isSquare(): Boolean = true
}

fun validatePolygon(polygon: Polygon){
    if(polygon is Square){
        polygon.isSquare()
    }
    polygon.draw()
}

var input: Any = 10
fun main(args: Array<String>) {
    var str = input as? String
    println(str?.length)
}