package commands.rotations.sides

import commands.rotations.Rotation


/**
 * The contents of the execute command from this class
 * are contained in the commands FrontPositive and FrontNegative.
 * @author svinoczar
 * @since alpha 1.0.0
 */

class OtherSides: Rotation() {
    override fun getName(): String {
        return "OtherSides"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        val tmpLeft = cube.leftSide
        val tmpRight = cube.rightSide

        cube.rightSide[0] = cube.topSide[6]
        cube.rightSide[7] = cube.topSide[5]
        cube.rightSide[6] = cube.topSide[4]

        cube.leftSide[2] = cube.botSide[0]
        cube.leftSide[3] = cube.botSide[1]
        cube.leftSide[4] = cube.botSide[2]

        cube.topSide[6] = tmpLeft[4]
        cube.topSide[5] = tmpLeft[3]
        cube.topSide[4] = tmpLeft[2]

        cube.botSide[0] = tmpRight[6]
        cube.botSide[1] = tmpRight[7]
        cube.botSide[2] = tmpRight[0]

        cube.frontSide.forEach {
            it.position = if (it.position != 8) (it.position + 2) % 8 else it.position
        }
    }
}