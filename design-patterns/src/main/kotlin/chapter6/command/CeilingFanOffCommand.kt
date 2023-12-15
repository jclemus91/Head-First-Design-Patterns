package chapter6.command

import chapter6.receiver.CeilingFan

class CeilingFanOffCommand(private val ceilingFan: CeilingFan): Command {
    override fun execute() {
        ceilingFan.off()
    }

    override fun undo() {
        ceilingFan.high()
    }
}