package commands.rotations.cube

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for clockwise rotation of the cube by z-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class OzPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        val frontTmp = cube.frontSide
        cube.frontSide = cube.rightSide
        cube.rightSide = cube.backSide
        cube.backSide = cube.leftSide
        cube.leftSide = frontTmp
        return cube
    }
}