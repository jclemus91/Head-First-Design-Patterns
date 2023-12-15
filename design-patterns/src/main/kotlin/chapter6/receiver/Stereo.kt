package chapter6.receiver

class Stereo(private val place: String) {
    fun on() {
        println("Stereo $place on")
    }
    fun off() {
        println("Stereo $place off")
    }
    fun setCD() {
        println("Stereo $place set CD")
    }
    fun setDvd() = Unit
    fun setRadio() = Unit
    fun setVolume(volume: Int) {
        println("Stereo $place setVolume $volume")
    }
}