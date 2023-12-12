package chapter3

class DarkRoast: Beverage() {

    init {
        description = "Dark Roast Coffee"
    }

    override fun cost(): Double {
        return .99
    }
}