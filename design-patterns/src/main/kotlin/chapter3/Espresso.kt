package chapter3

class Espresso: Beverage() {

    init {
        description = "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }
}