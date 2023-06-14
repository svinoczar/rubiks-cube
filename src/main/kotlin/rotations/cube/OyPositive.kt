package rotations.cube

import data.RubiksCube
import rotations.Rotation

/**
 * Command for clockwise rotation of the cube by y-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class OyPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        cube.topSide = cube.leftSide
        cube.leftSide = cube.botSide
        cube.botSide = cube.rightSide
        cube.rightSide = cube.topSide
        return cube
    }
}