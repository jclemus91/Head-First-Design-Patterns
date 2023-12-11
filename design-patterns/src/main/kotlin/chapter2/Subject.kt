package chapter2

interface Subject {
    fun registerObserver(observer: Observer)
    fun unregisterObserver(observer: Observer)
    fun notifyObservers()
}