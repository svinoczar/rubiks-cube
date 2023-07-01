package commands.rotations.cube

import data.RubiksCube
import commands.rotations.Rotation
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import utils.DefaultAssembler

/**
 * Command for counterclockwise rotation of the cube by x-axis.
 * Primary rotation command.
 *
 * @author svinoczar
 * @since alpha-1.0.0
 */

class OxNegative: Rotation() {
    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun cancel() {
        cube
    }

    override fun execute() {
        val frontTmp = cube.frontSide
        cube.frontSide = cube.botSide
        cube.botSide = cube.backSide
        cube.backSide = cube.topSide
        cube.topSide = frontTmp
    }
}