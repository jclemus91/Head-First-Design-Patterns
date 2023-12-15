package chapter6.command

import chapter6.receiver.Stereo

class StereoOffCommand(private val stereo: Stereo): Command {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }
}