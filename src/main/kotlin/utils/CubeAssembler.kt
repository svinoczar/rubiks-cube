package utils

import data.RubiksCube

interface CubeAssembler {
    fun buildDefault(): RubiksCube

    fun buildDefault(cube: RubiksCube): RubiksCube
}