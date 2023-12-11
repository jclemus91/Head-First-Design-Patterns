package chapter1.duck.quack.impl

import chapter1.duck.quack.QuackBehavior

class Quack: QuackBehavior {
    override fun quack() {
        println("Quack")
    }
}