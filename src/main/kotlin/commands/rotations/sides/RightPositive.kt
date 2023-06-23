package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for clockwise rotation of the right side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class RightPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        ozPositive.execute(cube)
        frontNegative.execute(cube)
        ozNegative.execute(cube)
        return cube
    }
}