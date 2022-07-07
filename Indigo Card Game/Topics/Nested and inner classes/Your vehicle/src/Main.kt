class Vehicle {
    inner class Engine {
        fun start() {
            println("RRRrrrrrrr....")
        }
    }
}
// do not touch the class above

fun main() {
    val bmw = Vehicle()
    val bmwEng = bmw.Engine()
    bmwEng.start()
}
