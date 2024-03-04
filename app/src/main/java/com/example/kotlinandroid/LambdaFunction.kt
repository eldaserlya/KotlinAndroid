package com.example.kotlinandroidpackage

fun main() {
    val a = { x: Int -> x * 6}
    println(a(9)) // Memanggil fungsi 'a' dengan argumen 5

    var dirtLevel = 36
    val waterFilter = { level: Int -> level / 2 }
    println(waterFilter(dirtLevel)) // Memanggil fungsi 'waterFilter' dengan argumen 'dirtLevel'
}


