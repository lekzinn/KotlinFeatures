package com.albsilva.kotlinfeatures.functions.advanced

data class Time(val hour: Int, val minutes: Int) {
    operator fun plus(time: Time): Time {
        val total = (this.hour * 60) + this.minutes + (time.hour * 60) + time.minutes
        val hour = total / 60
        val minutes = total % 60
        return Time(hour, minutes)
    }
}

fun main(args: Array<String>) {
    val result = Time(2,30) + Time(10, 40)
    println(result)
}