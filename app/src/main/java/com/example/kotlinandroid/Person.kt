package com.example.kotlinandroid

class Person(var firstName: String, var lastName: String) {
    var fullName: String = "$firstName $lastName"
}

fun main() {
    val person = Person("Fadillah","Ragil")
    println(person.firstName)
    println(person.lastName)
    println(person.fullName)
}

