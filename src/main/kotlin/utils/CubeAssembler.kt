package utils

import data.Box
import data.RubiksCube

interface CubeAssembler {
    fun fillSides()

    fun buildDefault(): RubiksCube

    fun buildDefault(cube: RubiksCube): RubiksCube
}