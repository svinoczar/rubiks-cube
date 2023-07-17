package utils

import commands.rotations.Rotation
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner

class CommandHandler {
    val commands = mutableMapOf<String, Rotation>()

    fun parsePackage () {
        val reflections = Reflections("commands/rotations", SubTypesScanner(false))
        val classes = reflections.getSubTypesOf(Object::class.java)
            .filter { klass -> !klass.simpleName.equals("Rotation") }
            .toSet()

        for (clazz in classes) {
            val command = clazz.getConstructor().newInstance() as Rotation
            commands[command.getName()] = command
        }
    }

    fun getCommand(commandName: String): Rotation? {
        return commands[commandName]
    }

}