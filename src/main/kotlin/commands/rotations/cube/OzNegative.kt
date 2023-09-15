package commands.rotations.cube

import data.RubiksCube
import commands.rotations.Rotation
import utils.DefaultAssembler

/**
 * Command for counterclockwise rotation of the cube by z-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class OzNegative: Rotation() {
    override fun getName(): String {
        return "OzNegative"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        val frontTmp = cube.frontSide
        cube.frontSide = cube.leftSide
        cube.leftSide = cube.backSide
        cube.backSide = cube. rightSide
        cube.rightSide = frontTmp
    }
}