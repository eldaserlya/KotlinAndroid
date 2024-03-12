package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printAquariumDetails()

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printAquariumDetails()

    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printAquariumDetails()

    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printAquariumDetails()

    val aquarium5 = Aquarium()
    aquarium5.printAquariumDetails()
    println("Volume: ${aquarium5.width * aquarium5.length * aquarium5.height / 1000} liters")

    val aquarium6 = Aquarium()
    aquarium6.printAquariumDetails()
    aquarium6.volume = 70
    aquarium6.printAquariumDetails()

    val myAquarium = Aquarium()
    myAquarium.printAquariumDetails()

    myAquarium.height = 60
    myAquarium.printAquariumDetails()


    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printAquariumDetails()


    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printAquariumDetails()

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")

        println("Shark: ${shark.color}")
        shark.eat()
        println("Plecostomus: ${pleco.color}")
        pleco.eat()
}

fun main () {
    buildAquarium()
    makeFish()
}
