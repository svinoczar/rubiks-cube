package rotations.sides

import data.RubiksCube
import rotations.Rotation

/**
 * Command for counterclockwise rotation of the top side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class TopNegative: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        oyPositive.execute(cube)
        ozPositive.execute(cube)
        frontNegative.execute(cube)
        ozNegative.execute(cube)
        oyNegative.execute(cube)
        return cube
    }
}