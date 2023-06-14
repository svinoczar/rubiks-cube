package rotations.sides

import data.RubiksCube
import rotations.Rotation
import rotations.cube.OzNegative
import rotations.cube.OzPositive

/**
 * Command for clockwise rotation of the left side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class LeftPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        ozNegative.execute(cube)
        frontPositive.execute(cube)
        ozPositive.execute(cube)
        return cube
    }
}