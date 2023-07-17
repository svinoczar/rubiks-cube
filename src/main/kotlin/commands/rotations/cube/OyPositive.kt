package commands.rotations.cube

import commands.rotations.Rotation

/**
 * Command for clockwise rotation of the cube by y-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class OyPositive: Rotation() {
    override fun getName(): String {
        return "OyPositive"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        val topTmp = cube.topSide
        cube.topSide = cube.leftSide
        cube.leftSide = cube.botSide
        cube.botSide = cube.rightSide
        cube.rightSide = topTmp
    }
}