package chapter1.duck.impl

import chapter1.duck.Duck
import chapter1.duck.fly.impl.FlyNoWay
import chapter1.duck.quack.impl.MuteQuack

class ModelDuck: Duck() {

    init {
        setFlyBehavior(FlyNoWay())
        setQuackBehavior(MuteQuack())
    }

    override fun display() {
        println("${this.javaClass.simpleName}")
    }
}