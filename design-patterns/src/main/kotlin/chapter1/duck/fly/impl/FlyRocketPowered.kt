package chapter1.duck.fly.impl

import chapter1.duck.fly.FlyBehavior

class FlyRocketPowered: FlyBehavior {
    override fun fly() {
        println("I am flying with a rocket")
    }
}