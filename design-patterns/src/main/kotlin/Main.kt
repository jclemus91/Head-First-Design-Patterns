import chapter1.duck.Duck
import chapter1.duck.fly.impl.FlyRocketPowered
import chapter1.duck.impl.MallardDuck
import chapter1.duck.impl.ModelDuck
import chapter2.CurrentConditionsDisplay
import chapter2.ForecastDisplay
import chapter2.StatisticsDisplay
import chapter2.WeatherData
import chapter3.*

fun main(args: Array<String>) {
    // strategy()
    // observer()
    decorator()
}

private fun strategy() {
    val duck: Duck = MallardDuck()
    duck.display()
    duck.performFly()
    duck.performQuack()

    println()

    val modelDuck = ModelDuck()
    modelDuck.display()
    modelDuck.performFly()
    modelDuck.setFlyBehavior(FlyRocketPowered())
    modelDuck.performFly()
}

private fun observer() {
    val weatherData = WeatherData().apply {
        CurrentConditionsDisplay(this)
        StatisticsDisplay(this)
        ForecastDisplay(this)
    }
    weatherData.setMeasurements(80f, 56f, 30.4f)
    println()
    weatherData.setMeasurements(82f, 70f, 29.2f)
    println()
    weatherData.setMeasurements(78f, 90f, 29.2f)
}

private fun decorator() {
    val beverage = Espresso()
    println("${beverage.description} $${beverage.cost()}")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println("${beverage2.description} $${beverage2.cost()}")

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println("${beverage3.description} $${beverage3.cost()}")
}




































































































































