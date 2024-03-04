package com.example.kotlinandroid

fun main() {
    val inst = listOf(7, 8, 9)
    println(inst.filter { it > 5 }) // Mencetak angka yang lebih besar dari 5

    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'b' || it[0] == 'B' }) // Mencetak buku-buku yang dimulai dengan huruf 'b' atau 'B'

    val list1 = listOf(7, 8, 9) // List tunggal dengan tiga elemen (7, 8, 9)
    val list2 = listOf<String>() // List kosong dengan tipe String
    val multi = listOf(listOf(7, 8), listOf(9, 10)) // List multidimensi
}


