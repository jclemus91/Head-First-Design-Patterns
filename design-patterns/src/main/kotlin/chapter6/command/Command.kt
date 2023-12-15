package chapter6.command

interface Command {
    fun execute()
    fun undo()
}