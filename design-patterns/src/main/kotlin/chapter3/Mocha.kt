package chapter3

class Mocha(override val beverage: Beverage) : CondimentDecorator() {


    init {
        description = "${beverage.description}, Mocha"
    }

    override fun cost(): Double {
        return beverage.cost() + .20
    }
}