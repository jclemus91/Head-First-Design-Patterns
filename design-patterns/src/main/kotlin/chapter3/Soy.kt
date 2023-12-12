package chapter3

class Soy(override val beverage: Beverage) : CondimentDecorator() {

    init {
        description = "${beverage.description}, Soy"
    }

    override fun cost(): Double {
        return beverage.cost() + .15
    }
}