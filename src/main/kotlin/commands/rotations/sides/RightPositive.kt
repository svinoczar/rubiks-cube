package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for clockwise rotation of the right side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class RightPositive: Rotation() {
    override fun getName(): String {
        return "RightPositive"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        ozPositive.execute()
        frontPositive.execute()
        ozNegative.execute()
    }
}