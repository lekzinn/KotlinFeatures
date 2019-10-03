package com.albsilva.kotlinfeatures.tidbits

import com.albsilva.kotlinfeatures.classes.PersonKotlin

fun capitalAndPopulationOfParana(): Pair<String, Long> = Pair("Curitiba", 2_000_000)

fun capitalCountryAndPopulationOfParana(): Triple<String, String, Long> = Triple("Curitiba", "Brazil",  2_000_000)

fun main(args: Array<String>) {

    val capitalAndPopulationOfParana = capitalAndPopulationOfParana()
//    println(capitalAndPopulationOfParana.first)
//    println(capitalAndPopulationOfParana.second)


    val (capital, population) = capitalAndPopulationOfParana()
    println(capital)
    println(population)

    val (capital2) = capitalAndPopulationOfParana()

    val (id, name, email) = PersonKotlin(1, "Alexandre", "email@at.com")
    println(id)
    println(name)
    println(email)

    val capitalCountryAndPopulationOfParana = capitalCountryAndPopulationOfParana()
//    println(capitalCountryAndPopulationOfParana.first)
//    println(capitalCountryAndPopulationOfParana.second)
//    println(capitalCountryAndPopulationOfParana.third)


    val citysAndPopulation = listOf(Pair("Curitiba", 2_000_000), "Cascavel" to 300_000)

    for((city, populationOfCity) in citysAndPopulation){
        println("City: $city - Population: $populationOfCity")
    }

    val createModel = auth("1234"){
       createModel()
    }

}




fun createModel(){
    println("Create Model!!!")
}

fun auth(password: String, block: () -> Unit){
    if(!password.equals("1234")){
        throw IllegalAccessException()
    }
    block()
}