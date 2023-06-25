package utils

import data.Box
import data.Color
import data.RubiksCube

class DefaultAssembler: CubeAssembler {
    private val topSide = arrayListOf<Box>()
    private val frontSide = arrayListOf<Box>()
    private val botSide = arrayListOf<Box>()
    private val backSide = arrayListOf<Box>()
    private val leftSide = arrayListOf<Box>()
    private val rightSide = arrayListOf<Box>()

    private val sides = arrayListOf<ArrayList<Box>>(topSide, frontSide, botSide, backSide, leftSide, rightSide)

    override fun fillSides() {
        for (side in sides) {
            for (color in Color.values()) {
                for (i in 0..8) {
                    side.add(Box(color, i))
                }
            }
        }
    }

    override fun buildDefault(): RubiksCube {
        fillSides()
        return RubiksCube(topSide, botSide, frontSide, backSide, leftSide, rightSide)
    }

    override fun buildDefault(cube: RubiksCube): RubiksCube {
        fillSides()
        cube.topSide = topSide
        cube.frontSide = frontSide
        cube.botSide = botSide
        cube.backSide = backSide
        cube.leftSide = leftSide
        cube.rightSide = rightSide

        return cube
    }

}