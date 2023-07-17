package commands.rotations.cube

import data.RubiksCube
import commands.rotations.Rotation
import utils.DefaultAssembler

/**
 * Command for clockwise rotation of the cube by x-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class OxPositive: Rotation() {
    override fun getName(): String {
        return "OxPositive"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        val frontTmp = cube.frontSide
        cube.frontSide = cube.topSide
        cube.topSide = cube.backSide
        cube.backSide = cube.botSide
        cube.botSide = frontTmp
    }
}