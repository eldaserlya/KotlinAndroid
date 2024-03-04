package com.example.kotlinandroidpackage

fun main() {
    val a = { x: Int -> x * 12}
    println(a(9)) // Memanggil fungsi 'a' dengan argumen 5

    var dirtLevel = 89
    val waterFilter = { level: Int -> level / 4 }
    println(waterFilter(dirtLevel)) // Memanggil fungsi 'waterFilter' dengan argumen 'dirtLevel'
}


