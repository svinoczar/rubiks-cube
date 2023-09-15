package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation
import utils.DefaultAssembler

/**
 * Command for counterclockwise rotation of the left side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class LeftNegative: Rotation() {
    override fun getName(): String {
        return "LeftNegative"
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        ozNegative.execute()
        frontNegative.execute()
        ozPositive.execute()
    }
}