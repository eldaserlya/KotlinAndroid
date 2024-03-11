package com.example.kotlinandroid

class House {
    var houseColor: String = "White"
    val numberOfWindows: Int = 2
    var isForSale: Boolean = false

    fun updateColor() {
    }

    private fun putOnSale() {
    }
}

fun main() {
    val A1 = House()
    val A2 = House()
    val A3 = House()

    A1.houseColor = "Pink"
    println(A1.houseColor)
    A2.houseColor = "Ungu"
    println(A2.houseColor)
    A3.houseColor = "Warna-Warni"
    println(A3.houseColor)
}
