package data

data class RubiksCube(
    var upSide: ArrayList<Box>,
    var downSide: ArrayList<Box>,
    var frontSide: ArrayList<Box>,
    var backSide: ArrayList<Box>,
    var leftSide: ArrayList<Box>,
    var rightSide: ArrayList<Box>
)
