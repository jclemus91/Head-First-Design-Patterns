package chapter3

class SteamedMilk(override val beverage: Beverage) : CondimentDecorator() {

    init {
        description = "${beverage.description}, Steamed Milk"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}