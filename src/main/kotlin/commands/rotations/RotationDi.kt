package commands.rotations

import commands.rotations.cube.*
import org.koin.dsl.module
import commands.rotations.sides.FrontPositive
import commands.rotations.sides.FrontNegative

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
}