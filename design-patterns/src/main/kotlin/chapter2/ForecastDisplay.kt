package chapter2


class ForecastDisplay(private val weatherData: WeatherData): Observer, DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.pressure
        display()
    }

    override fun display() {
        print("Forecast: ")
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            println("More of the same")
        } else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather")
        }
    }
}