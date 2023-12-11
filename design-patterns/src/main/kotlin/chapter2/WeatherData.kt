package chapter2

class WeatherData: Subject {

    private val observers = HashSet<Observer>()
    var temp = 0f
    var humidity = 0f
    var pressure = 0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach(Observer::update)
    }

    private fun measurementsChanges() {
        notifyObservers()
    }

    fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanges()
    }
}