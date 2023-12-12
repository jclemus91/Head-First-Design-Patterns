package chapter3

class Decaf: Beverage() {

    init {
        description = "Decaf Coffee"
    }

    override fun cost(): Double {
        return 1.05
    }
}