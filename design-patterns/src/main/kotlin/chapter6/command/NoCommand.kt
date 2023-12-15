package chapter6.command

object NoCommand: Command {
    override fun execute() = Unit

    override fun undo() = Unit
}