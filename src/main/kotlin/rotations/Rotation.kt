package rotations

import data.RubiksCube
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import rotations.cube.*
import rotations.sides.FrontNegative
import rotations.sides.FrontPositive

/**
 * A basic interface for implementing rotation commands.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
abstract class Rotation: KoinComponent {
    val oyPositive: OyPositive by inject()
    val oyNegative: OyNegative by inject()
    val ozPositive: OzPositive by inject()
    val ozNegative: OzNegative by inject()
    val frontPositive: FrontPositive by inject()
    val frontNegative: FrontNegative by inject()

    abstract fun getName (): String

    abstract fun getDescription (): String

    abstract fun execute (cube: RubiksCube): RubiksCube
}