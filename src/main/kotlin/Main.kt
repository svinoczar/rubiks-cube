import Data.Box
import Data.Color
import Data.RubiksCube

fun main() {
    val b1 = Box(Color.RED, 0)
    val b2 = Box(Color.YELLOW, 1)
    val b3 = Box(Color.BLUE, 2)
    val b4 = Box(Color.GREEN, 7)
    val b5 = Box(Color.WHITE, 8)
    val b6 = Box(Color.RED, 3)
    val b7 = Box(Color.ORANGE, 6)
    val b8 = Box(Color.WHITE, 5)
    val b9 = Box(Color.YELLOW, 4)

    val rubiksCube = RubiksCube(
        arrayListOf(b1, b2, b3, b4, b5, b6, b7, b8, b9),
        arrayListOf(b1, b2, b3, b4, b5, b6, b7, b8, b9),
        arrayListOf(b1, b2, b3, b4, b5, b6, b7, b8, b9),
        arrayListOf(b1, b2, b3, b4, b5, b6, b7, b8, b9),
        arrayListOf(b1, b2, b3, b4, b5, b6, b7, b8, b9),
        arrayListOf(b1, b2, b3, b4, b5, b6, b7, b8, b9)
    )

//    val r = "\u001B[0m"
//    val b = "\u001B[30m"
//
//    val R = "\u001B[31m▬$b"
//    val G = "\u001B[32m▬$b"
//    val Y = "\u001B[33m▬$b"
//    val B = "\u001B[34m▬$b"
//    val O = "\u001B[38;5;208m▬$b"
//    val W = "\u001B[38m▬$b"



//    val row1 = arrayListOf<String>(R, Y, B)
//    val row2 = arrayListOf<String>(G, W, R)
//    val row3 = arrayListOf<String>(O, W, Y)
//    val arr = arrayListOf<ArrayList<String>>(row1, row2, row3)

//    arr.forEach { println(it) }
//    row1.forEach { print("$it ") }
//    println()
//    row2.forEach { print("$it ") }
//    println()
//    row3.forEach { print("$it ") }
//


    frontRotR(rubiksCube.frontSide)

    frontRotL(rubiksCube.frontSide)

    rubiksCube.frontSide.forEach {
        println((it.position))
    }


}



fun frontRotR(side: ArrayList<Box>) {
    side.forEach {
        it.position = if (it.position != 8) if ((it.position - 2) < 0) (it.position - 2) + 8 else (it.position - 2) + 0 else it.position
    }
}

fun frontRotL(side: ArrayList<Box>) {
    side.forEach {
        it.position = if (it.position != 8) (it.position + 2) % 8 else it.position
    }
}