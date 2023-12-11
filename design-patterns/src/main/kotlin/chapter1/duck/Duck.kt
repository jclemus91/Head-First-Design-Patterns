package chapter1.duck

import chapter1.duck.fly.FlyBehavior
import chapter1.duck.quack.QuackBehavior

abstract class Duck {

    private lateinit var flyBehavior: FlyBehavior
    private lateinit var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() = flyBehavior.fly()

    fun performQuack() = quackBehavior.quack()

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }

    fun swim() {
        println("all ducks swim, even decoys!")
    }
}