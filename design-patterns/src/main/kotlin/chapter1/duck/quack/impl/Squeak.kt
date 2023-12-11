package chapter1.duck.quack.impl

import chapter1.duck.quack.QuackBehavior

class Squeak: QuackBehavior {
    override fun quack() {
        println("squeak")
    }
}