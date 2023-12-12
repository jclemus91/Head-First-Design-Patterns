package chapter3

class Whip(override val beverage: Beverage) : CondimentDecorator() {

    init {
        description = "${beverage.description}, Whip"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}