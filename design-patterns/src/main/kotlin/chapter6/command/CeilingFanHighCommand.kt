package chapter6.command

import chapter6.receiver.CeilingFan

class CeilingFanHighCommand(private val ceilingFan: CeilingFan): Command {

    var prevSpeed = -1

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.high()
    }

    override fun undo() {
        when(prevSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.OFF -> ceilingFan.off()
        }
    }
}