package chapter2


class StatisticsDisplay(private val weatherData: WeatherData): Observer, DisplayElement {

    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        with(weatherData) {
            tempSum += temp
            numReadings++
            if (temp > maxTemp) {
                maxTemp = temp
            }
            if (temp < minTemp) {
                minTemp = temp
            }
        }
        display()
    }

    override fun display() {
        println(
            "Avg/Max/Min temperature = " + tempSum / numReadings
                    + "/" + maxTemp + "/" + minTemp
        )
    }

}