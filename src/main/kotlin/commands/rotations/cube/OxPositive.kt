package commands.rotations.cube

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for clockwise rotation of the cube by x-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class OxPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        cube.frontSide = cube.botSide
        cube.botSide = cube.backSide
        cube.backSide = cube.topSide
        cube.topSide = cube.frontSide
        return cube
    }
}