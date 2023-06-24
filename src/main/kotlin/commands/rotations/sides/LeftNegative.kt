package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for counterclockwise rotation of the left side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class LeftNegative: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        ozNegative.execute(cube)
        frontNegative.execute(cube)
        ozPositive.execute(cube)
        return cube
    }
}