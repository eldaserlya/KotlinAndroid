package com.example.kotlinandroid

fun main() {
    val input = "ini hari Minggu yang cerah dan berawan"


    val enc1: (String) -> String = { input -> input.toUpperCase() }
    println(encodeMsg(input) { it.capitalize() })
}

fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}


