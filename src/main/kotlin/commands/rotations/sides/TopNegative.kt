package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation

/**
 * Command for counterclockwise rotation of the top side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class TopNegative: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        oyNegative.execute()
        ozNegative.execute()
        frontNegative.execute()
        ozPositive.execute()
        oyPositive.execute()
    }
}