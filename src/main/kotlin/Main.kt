import data.Box
import data.Color
import data.RubiksCube
import org.koin.core.context.startKoin
import commands.rotations.rotationModule
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import utils.CommandHandler
import utils.DefaultAssembler
import utils.io.Printer

fun main() {
    startKoin {
        modules(rotationModule)
    }
    val di = Di()
    di.defaultAssembler.build()
    val cube = DefaultAssembler.rubiksCube

    if (cube != null) {
        di.printer.blueprinter(cube)
    }

}

class Di: KoinComponent {
    val printer: Printer by inject()
    val defaultAssembler: DefaultAssembler by inject()
}