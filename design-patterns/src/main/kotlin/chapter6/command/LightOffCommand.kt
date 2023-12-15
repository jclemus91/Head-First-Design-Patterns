package chapter6.command

import chapter6.receiver.Light

class LightOffCommand(private val light: Light): Command {

    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}