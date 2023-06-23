package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation


/**
 * Command for clockwise rotation of the front side.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class FrontPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String {
        TODO("Not yet implemented")
    }

    override fun execute(cube: RubiksCube): RubiksCube {
        cube.frontSide.forEach {
            it.position = if (it.position != 8) (it.position + 2) % 8 else it.position
        }
        return cube
    }
}