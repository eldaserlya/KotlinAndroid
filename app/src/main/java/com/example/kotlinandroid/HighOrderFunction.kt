package com.example.kotlinandroid

fun main(){
    val enc1:(string)->String = {input ->input.toUpperCase()}
    println (encodeMsg(msg::"Ini SELASA", enc1))
    println(encodeMsg(input, {input -> input.capitalize()}) //penulisan direct function bisa dimodif
}

//Fungsi high order
fun encodeMsg(msg: String, encode: (String)-> String) :String { //memiliki 2 parameter msg dan encode
    return encode(msg)
}

fun upperCase(input::String):String{
    return upperCase()
}

