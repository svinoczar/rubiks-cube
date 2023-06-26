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
    private val positions = arrayListOf(0,1,2,7,8,3,6,5,4)

    override fun fillSides() {
        //работает.. не факт, что так как надо
        for ((side, color) in sides.zip(Color.values())) {
            for (position in positions) {
                side.add(Box(color, position))
            }
        }
    }

    override fun buildDefault(): RubiksCube {
        fillSides()
        println(topSide)
        println(botSide)
        println(frontSide)
        println(backSide)
        println(leftSide)
        println(rightSide)
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