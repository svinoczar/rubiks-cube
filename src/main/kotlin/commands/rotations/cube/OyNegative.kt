package commands.rotations.cube

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for counterclockwise rotation of the cube by y-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class OyNegative: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        val topTmp = cube.topSide
        cube.topSide = cube.rightSide
        cube.rightSide = cube.botSide
        cube.botSide = cube.leftSide
        cube.leftSide = topTmp
        return cube
    }
}