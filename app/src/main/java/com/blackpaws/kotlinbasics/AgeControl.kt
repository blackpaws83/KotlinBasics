package com.blackpaws.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
) {

}

fun main() {
    val coffeeForDennis = CoffeeDetails(
        1,
        "Dennis",
        "XXL",
        4)

    makeCoffee(coffeeForDennis)
}

//fun giveCoffeeDetails() {
//    println("Who is this coffee for?")
//    var name = readln()
//    println("How many pieces of sugar?")
//    var sugarCount = readln().toInt()
//}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    val sugarAmount = if (coffeeDetails.sugarCount < 1) {
        "no"
    } else {
        val spoonWord = if (coffeeDetails.sugarCount == 1) {
            "spoon"
        } else {
            "spoons"
        }
        "${coffeeDetails.sugarCount} $spoonWord of sugar"
    }
    val creamAmount = if (coffeeDetails.creamAmount < 1) {
        "no"
    } else {
        val spoonWord = if (coffeeDetails.creamAmount == 1) {
            "spoon"
        } else {
            "spoons"
        }
        "${coffeeDetails.creamAmount} $spoonWord of cream"
    }

    println("Coffee with $sugarAmount, $creamAmount, size ${coffeeDetails.size} for ${coffeeDetails.name}")

}