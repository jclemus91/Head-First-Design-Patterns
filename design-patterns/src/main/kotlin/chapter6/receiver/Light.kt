package chapter6.receiver

class Light(private val place: String) {

    fun on() {
        println("Light $place on")
    }
    fun off() {
        println("Light $place off")
    }
}