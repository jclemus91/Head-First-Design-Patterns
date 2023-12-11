package chapter2

class CurrentConditionsDisplay(private val weatherData: WeatherData) : Observer, DisplayElement {

    private var temp = 0f
    private var humidity = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        with(weatherData) {
            this@CurrentConditionsDisplay.temp = temp
            this@CurrentConditionsDisplay.humidity = humidity
        }
        display()
    }

    override fun display() {
        println("Current conditions: $temp F degrees and ${humidity}% humidity")
    }
}