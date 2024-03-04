package com.example.kotlinandroid

fun main() {
    val inst = listOf(1, 2, 3)
    println(inst.filter { it > 0 }) // Mencetak angka yang lebih besar dari 0

    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'B' }) // Mencetak buku-buku yang dimulai dengan huruf 'B'

    val list1 = listOf(123) // List tunggal dengan satu elemen (123)
    val list2 = listOf<String>() // List kosong dengan tipe String
    val multi = listOf(listOf(1, 2), listOf(3, 4)) // List multidimensi
}

