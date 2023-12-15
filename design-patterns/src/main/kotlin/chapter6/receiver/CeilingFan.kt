package chapter6.receiver

class CeilingFan(private val location: String, var speed: Int = OFF) {

    fun high() {
        speed = HIGH
        println("CeilingFan $location HIGH")
    }

    fun medium() {
        speed = MEDIUM
        println("CeilingFan $location MEDIUM")
    }

    fun low() {
        speed = LOW
        println("CeilingFan $location LOW")
    }

    fun off() {
        speed = OFF
        println("CeilingFan $location OFF")
    }

    companion object {
        const val HIGH = 3
        const val MEDIUM = 2
        const val LOW = 1
        const val OFF = 0
    }
}