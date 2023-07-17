import data.Box
import data.Color
import data.RubiksCube
import org.koin.core.context.startKoin
import commands.rotations.rotationModule
import commands.rotations.sides.FrontNegative
import commands.rotations.sides.RightPositive
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import utils.CommandHandler
import utils.DefaultAssembler
import utils.io.Printer

fun main() {
    startKoin {
        modules(rotationModule) // Koin module init
    }

    /**
     * Main init block
     */
    val di = Di()
    di.defaultAssembler.build()
    var cube = DefaultAssembler.rubiksCube
    di.commandHandler.parsePackage()

    di.commandHandler.getCommand("RightPositive")?.execute()
    cube = DefaultAssembler.rubiksCube

    if (cube != null) {
        di.printer.blueprinter(cube)
    }

}

class Di: KoinComponent {
    val printer: Printer by inject()
    val defaultAssembler: DefaultAssembler by inject()
    val commandHandler: CommandHandler by inject()
}