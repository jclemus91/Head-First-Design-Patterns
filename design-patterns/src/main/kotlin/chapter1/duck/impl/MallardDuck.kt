package chapter1.duck.impl

import chapter1.duck.Duck
import chapter1.duck.fly.impl.FlightWithWings
import chapter1.duck.quack.impl.Quack

class MallardDuck : Duck() {

    init {
        setFlyBehavior(FlightWithWings())
        setQuackBehavior(Quack())
    }

    override fun display() {
        println("${this.javaClass.simpleName}")
    }

}