package com.blackpaws.kotlinbasics

import java.time.Year
import java.util.Calendar

class BookClass(
    public val title: String = "Unknown",
    public val author: String = "Anonymous",
    public val yearPublished: Int = Calendar.getInstance().get(Calendar.YEAR)
    ){

}