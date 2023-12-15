package chapter6.invoker

import chapter6.command.Command
import chapter6.command.NoCommand


class RemoteControl {

    private val onCommands = Array<Command>(7) { NoCommand }
    private val offCommands = Array<Command>(7) { NoCommand }
    private var undoCommand: Command = NoCommand
    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        val stringBuffer = StringBuffer().apply {
            append("\n----- RemoteControl -----\n")
            for (index in onCommands.indices) {
                append("[slot $index] ${onCommands[index].javaClass.name}    ${offCommands.javaClass.name}\n")
            }
            append("\n----- END RemoteControl -----\n")
        }

        return stringBuffer.toString()
    }
}