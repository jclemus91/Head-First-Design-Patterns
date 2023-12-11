import chapter1.duck.Duck
import chapter1.duck.fly.impl.FlyRocketPowered
import chapter1.duck.impl.MallardDuck
import chapter1.duck.impl.ModelDuck
import chapter2.CurrentConditionsDisplay
import chapter2.ForecastDisplay
import chapter2.StatisticsDisplay
import chapter2.WeatherData

fun main(args: Array<String>) {

    // strategy()
    observer()
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






































































































































