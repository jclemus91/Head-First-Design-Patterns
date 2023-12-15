package chapter6.command

import chapter6.receiver.Light

class LightOnCommand(private val light: Light): Command {

    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}