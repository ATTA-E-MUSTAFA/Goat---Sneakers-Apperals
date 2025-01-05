package com.guneet.goat_sneakersapparels


data class Product(
    val Category: String = "",
    val Description: String = "",
    val Price: String = "",
    val Image: String = "",  // URL of the product image in Firebase
    val Id: Int = 0
)