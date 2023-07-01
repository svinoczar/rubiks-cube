package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation
import utils.DefaultAssembler

/**
 * Command for counterclockwise rotation of the front side.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class FrontNegative: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        val tmpLeft = cube.leftSide
        val tmpRight = cube.rightSide

        cube.rightSide[0] = cube.botSide[2]
        cube.rightSide[7] = cube.botSide[1]
        cube.rightSide[6] = cube.botSide[0]

        cube.leftSide[2] = cube.topSide[4]
        cube.leftSide[3] = cube.topSide[5]
        cube.leftSide[4] = cube.topSide[6]

        cube.topSide[6] = tmpRight[0]
        cube.topSide[5] = tmpRight[7]
        cube.topSide[4] = tmpRight[6]

        cube.botSide[0] = tmpLeft[2]
        cube.botSide[1] = tmpLeft[3]
        cube.botSide[2] = tmpLeft[4]
        cube.frontSide.forEach {
            it.position = if (it.position != 8) if ((it.position - 2) < 0) (it.position - 2) + 8 else (it.position - 2) + 0 else it.position
        }
    }
}