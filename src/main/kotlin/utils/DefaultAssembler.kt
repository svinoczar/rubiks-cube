package utils

import data.Box
import data.Color
import data.RubiksCube

class DefaultAssembler: CubeAssembler {
    private val w = Box(Color.WHITE)
    private val r = Box(Color.RED)
    private val y = Box(Color.YELLOW)
    private val o = Box(Color.ORANGE)
    private val b = Box(Color.BLUE)
    private val g = Box(Color.GREEN)

    private val topSide = arrayListOf(y, y, y, y, y, y, y, y, y)
    private val frontSide = arrayListOf(r, r, r, r, r, r, r, r, r,)
    private val botSide = arrayListOf(w, w, w, w, w, w, w, w, w)
    private val backSide = arrayListOf(o, o, o, o, o, o, o, o, o)
    private val leftSide = arrayListOf(b, b, b, b, b, b, b, b, b)
    private val rightSide = arrayListOf(g, g, g, g, g, g, g, g, g)

    override fun buildDefault(): RubiksCube {
        return RubiksCube(topSide, botSide, frontSide, backSide, leftSide, rightSide)
    }

    override fun buildDefault(cube: RubiksCube): RubiksCube {
        cube.topSide = topSide
        cube.frontSide = frontSide
        cube.botSide = botSide
        cube.backSide = backSide
        cube.leftSide = leftSide
        cube.rightSide = rightSide

        return cube
    }

}