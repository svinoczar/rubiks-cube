package rotations

import org.koin.dsl.module
import rotations.cube.*
import rotations.sides.FrontNegative
import rotations.sides.FrontPositive

val rotationModule = module {
    single {
        OyPositive()
    }

    single {
        OyNegative()
    }

    single {
        OzPositive()
    }

    single {
        OzNegative()
    }

    single {
        FrontPositive()
    }

    single {
        FrontNegative()
    }
}