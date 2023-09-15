package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation
import utils.DefaultAssembler

/**
 * Command for counterclockwise rotation of the right side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class RightNegative: Rotation() {
    override fun getName(): String {
        return "RightNegative"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        ozPositive.execute()
        frontNegative.execute()
        ozNegative.execute()
    }
}