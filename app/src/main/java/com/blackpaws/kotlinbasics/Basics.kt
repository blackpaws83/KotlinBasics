package com.blackpaws.kotlinbasics

fun main() {

    var daisy = Dog("Daisy", "Dwarf poodle", 1)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    println("A year has passed")
    daisy.age = 2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

//    var myBook = BookClass()
//    println(myBook.title)
//    println(myBook.author)
//    println(myBook.yearPublished)
//    var customBook = BookClass("War and Peace", "Leo Tolstoy", 1873)
//    println(customBook.title)
//    println(customBook.author)
//    println(customBook.yearPublished)
}

