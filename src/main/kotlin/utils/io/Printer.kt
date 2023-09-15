package utils.io

import data.Box
import data.RubiksCube
import kotlin.reflect.full.memberProperties


class Printer: RubiksCubePrinter {

    override fun blueprinter(cube: RubiksCube) {
        val sides = cube::class.memberProperties.reversed()
        for (s in sides) {
            println("${s.name}:")
            val side = s.call(cube) as ArrayList<Box>
            side.forEachIndexed { i, box ->
                val color = box.color.toString().lowercase()[0]
                if ((i + 1) % 3 != 0) {
                    print("|$color")
                } else {
                    println("|$color|")
                }
            }
            println()
        }
    }
}