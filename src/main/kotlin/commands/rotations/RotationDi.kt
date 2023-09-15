package commands.rotations

import commands.rotations.cube.*
import org.koin.dsl.module
import commands.rotations.sides.FrontPositive
import commands.rotations.sides.FrontNegative
import data.RubiksCube
import utils.CommandHandler
import utils.DefaultAssembler
import utils.io.Printer

val rotationModule = module {
    single {
        OyNegative()
    }

    single {
        OyPositive()
    }

    single {
        OzPositive()
    }

    single {
        OzNegative()
    }

    single {
        FrontNegative()
    }

    single {
        FrontPositive()
    }

    single {
        Printer()
    }

    single {
        DefaultAssembler()
    }

    single {
        CommandHandler()
    }
}