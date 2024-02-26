package com.example.kotlinandroid

fun main(args: Array<String>) {
    biodata("Elda Serlya Dwi Seviana", 19, "Magetan, 24 Juli 2004", "Desa Plalangan, Kec.Jenangan, Kab.Ponorogo, Jawa Timur")
    hobby("Melukis", "melukis kehidupan agar penuh warna")
}

fun biodata(name: String, age: Int, placeOfBirth: String, address: String) {
    println("==========================================================================")
    println("Nama\t : $name")
    println("Usia\t : $age")
    println("TTL\t     : $placeOfBirth")
    println("Alamat\t : $address")
    println("==========================================================================")
    println("Hallo Sobat namaku $name aku berusia $age tahun dan aku tinggal di $address")
    println("Aku lahir 19 tahun yang lalu tempat tanggal lahirku yaitu $placeOfBirth")
}
fun hobby(hobby: String, desc: String) {
    println("Saat ini saya mempunyai hobby baru yaitu $hobby")
    println("Hobby saya ini tidak sekedar mencoret biasa di atas kanvas tetapi $desc")
}
