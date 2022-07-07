import kotlin.math.abs

//fun main() {
    fun perimeter(
        x1: Double, y1: Double,
        x2: Double, y2: Double,
        x3: Double, y3: Double,
        x4: Double = x3, y4: Double = y3
    ): Double {
        val r1 = Math.hypot(x2 - x1, y2 - y1)
        val r2 = Math.hypot(x3 - x2, y3 - y2)
        var r3 = 0.0
        var r4 = 0.0
        if (x4 != x3 || y4 != y3) {
            r3 = Math.hypot(x4 - x3, y4 - y3)
            r4 = Math.hypot(x1 - x4, y1 - y4)
        } else {
            r3 = Math.hypot(x1 - x3, y1 - y3)
        }
        //println("$r1 $r2 $r3 $r4")
        val perimetr = r1 + r2 + r3 + r4
        return perimetr
    }

    //println(perimeter(0.0, 0.0, 12.0, 0.0, 12.0, 5.0))
//}