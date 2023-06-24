package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for clockwise rotation of the top side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class TopPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        oyNegative.execute(cube)
        ozNegative.execute(cube)
        frontPositive.execute(cube)
        ozPositive.execute(cube)
        oyPositive.execute(cube)
        return cube
    }
}