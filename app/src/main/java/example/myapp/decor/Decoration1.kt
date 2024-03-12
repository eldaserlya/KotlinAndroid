package example.myapp.decor

fun makeDecorations() {
    val decoration1 = Decoration("granite", "oak", "diver")
    println(decoration1)

    val decoration2 = Decoration("slate", "cedar", "diver")
    println(decoration2)

    val decoration3 = Decoration("slate", "mahogany", "diver")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
}

fun main() {
    makeDecorations()

    val d5 = Decoration("crystal", "wood", "diver")
    println(d5)

    // Mendekonstruksi objek d5 dan menetapkan nilainya ke variabel-variabel terpisah.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}