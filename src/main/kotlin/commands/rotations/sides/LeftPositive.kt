package commands.rotations.sides

import data.RubiksCube
import commands.rotations.Rotation
import utils.DefaultAssembler

/**
 * Command for clockwise rotation of the left side.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */
class LeftPositive: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun execute() {
        ozNegative.execute()
        frontPositive.execute()
        ozPositive.execute()
    }
}