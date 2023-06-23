package commands.rotations

import commands.rotations.cube.*
import data.RubiksCube
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import commands.rotations.sides.FrontPositive
import commands.rotations.sides.FrontNegative

/**
 * A basic interface for implementing rotation commands.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
abstract class Rotation: KoinComponent {
    val oyNegative: OyNegative by inject()
    val oyPositive: OyPositive by inject()
    val ozPositive: OzPositive by inject()
    val ozNegative: OzNegative by inject()
    val frontNegative: FrontNegative by inject()
    val frontPositive: FrontPositive by inject()

    abstract fun getName (): String

    abstract fun getDescription (): String

    abstract fun execute (cube: RubiksCube): RubiksCube
}