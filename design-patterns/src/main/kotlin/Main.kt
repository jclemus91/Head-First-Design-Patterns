import chapter1.duck.Duck
import chapter1.duck.fly.impl.FlyRocketPowered
import chapter1.duck.impl.MallardDuck
import chapter1.duck.impl.ModelDuck
import chapter2.CurrentConditionsDisplay
import chapter2.ForecastDisplay
import chapter2.StatisticsDisplay
import chapter2.WeatherData
import chapter3.*
import chapter6.command.*
import chapter6.invoker.RemoteControl
import chapter6.receiver.CeilingFan
import chapter6.receiver.Light
import chapter6.receiver.Stereo

fun main(args: Array<String>) {
    // strategy()
    // observer()
    // decorator()
    command()
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

private fun command() {
    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen Light")
    val stereo = Stereo("Living Room")
    val ceilingFan = CeilingFan("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)

    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)

    val stereoOnWithCD = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    val ceilingFanHighCommand = CeilingFanHighCommand(ceilingFan)
    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)

    val partyOnMacro = MacroCommand(arrayOf(livingRoomLightOn, kitchenLightOn, stereoOnWithCD, ceilingFanHighCommand))
    val partyOffMacro = MacroCommand(arrayOf(livingRoomLightOff, kitchenLightOff, stereoOff, ceilingFanOffCommand))

    val remoteControl = RemoteControl()

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, stereoOnWithCD, stereoOff)
    remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand)
    remoteControl.setCommand(4, partyOnMacro, partyOffMacro)

    println(remoteControl)

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)
    remoteControl.undoButtonWasPushed()
    println(remoteControl)

    remoteControl.onButtonWasPushed(1)
    remoteControl.offButtonWasPushed(1)
    remoteControl.undoButtonWasPushed()
    println(remoteControl)

    remoteControl.onButtonWasPushed(2)
    remoteControl.offButtonWasPushed(2)
    remoteControl.undoButtonWasPushed()
    println(remoteControl)

    remoteControl.onButtonWasPushed(3)
    remoteControl.offButtonWasPushed(3)
    remoteControl.undoButtonWasPushed()
    println(remoteControl)

    remoteControl.onButtonWasPushed(4)
    remoteControl.offButtonWasPushed(4)
    remoteControl.undoButtonWasPushed()
    println(remoteControl)
}




































































































































