package chapter1.duck.quack.impl

import chapter1.duck.quack.QuackBehavior

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("Silence")
    }
}