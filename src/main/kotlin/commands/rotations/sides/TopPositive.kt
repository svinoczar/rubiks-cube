package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for clockwise rotation of the top side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class TopPositive: Rotation() {
    override fun getName(): String {
        return "TopPositive"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        oyNegative.execute()
        ozNegative.execute()
        frontPositive.execute()
        ozPositive.execute()
        oyPositive.execute()
    }
}