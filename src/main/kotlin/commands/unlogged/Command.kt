package commands.unlogged

import data.RubiksCube
import org.koin.core.component.KoinComponent

abstract class Command: KoinComponent {
    abstract fun getName (): String

    abstract fun execute ()
}