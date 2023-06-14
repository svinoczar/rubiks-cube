package data

data class RubiksCube(
    var topSide: ArrayList<Box>,
    var botSide: ArrayList<Box>,
    var frontSide: ArrayList<Box>,
    var backSide: ArrayList<Box>,
    var leftSide: ArrayList<Box>,
    var rightSide: ArrayList<Box>
)
