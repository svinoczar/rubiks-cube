package utils

import data.Box
import data.Color
import data.RubiksCube

class DefaultAssembler: CubeAssembler {
    companion object {
        private val topSide = arrayListOf<Box>()
        private val frontSide = arrayListOf<Box>()
        private val botSide = arrayListOf<Box>()
        private val backSide = arrayListOf<Box>()
        private val leftSide = arrayListOf<Box>()
        private val rightSide = arrayListOf<Box>()
        var rubiksCube: RubiksCube? = null
    }

    private val sides = arrayListOf<ArrayList<Box>>(topSide, frontSide, botSide, backSide, leftSide, rightSide)
    private val positions = arrayListOf(0,1,2,7,8,3,6,5,4)

    override fun fillSides() {
        for ((side, color) in sides.zip(Color.values())) {
            for (position in positions) {
                side.add(Box(color, position))
            }
        }
    }

    override fun build() {
        if (rubiksCube == null) {
            fillSides()
            rubiksCube = RubiksCube(topSide, botSide, frontSide, backSide, leftSide, rightSide)
        } else {
            error("Rubik's Cube is already exist!")
        }
    }


}