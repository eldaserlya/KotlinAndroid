package example.myapp

open class Aquarium(
    var width: Int = 20,
    var height: Int = 40,
    var length: Int = 100
) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open fun printAquariumDetails() {
        println("$shape")
        println("Width: $width cm Length: $length cm Height: $height cm ")
        println("Volume: $volume liters")
    }
}

class TowerTank(
    diameter: Int,
    height: Int
) : Aquarium(diameter, height) {
    override var volume: Int
        get() = (width * width * height * Math.PI / 4000).toInt()
        set(value) {
            val radius = Math.cbrt(value * 1000 / Math.PI)
            width = (radius * 2).toInt()
            height = (value * 1000) / (width * width)
        }

    override val shape = "cylinder"
}