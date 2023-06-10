package Data

data class RubiksCube(
    val upSide: ArrayList<Box>,
    val downSide: ArrayList<Box>,
    val frontSide: ArrayList<Box>,
    val backSide: ArrayList<Box>,
    val leftSide: ArrayList<Box>,
    val rightSide: ArrayList<Box>
)
