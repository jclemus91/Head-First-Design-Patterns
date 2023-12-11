package chapter1.duck.fly.impl

import chapter1.duck.fly.FlyBehavior

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("I can't fly")
    }
}