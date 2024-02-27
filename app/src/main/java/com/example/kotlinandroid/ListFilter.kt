package com.example.kotlinandroid

fun main(){
    val inst = listOf(1, 2,3)
    println(inst.filter{ it > 0})

    val books = listOf("nature", "biology", "birds")
    println(books.filter{it[0]== 'B'})
}