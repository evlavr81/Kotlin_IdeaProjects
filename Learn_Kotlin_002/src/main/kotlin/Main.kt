fun main(args: Array<String>) {
    fun limitSpeed(speed: Int, limit: Int = 60) {
        if (speed > limit) println("Exceeds the limit by ${speed - limit} kilometers per hour")
        else println("Within the limit")
    }

    val speed: Int = readln().toInt()
    val limitS: String = readln()
    var limit: Int = 60
    if (limitS in "1234567890") limit = limitS.toInt()
    limitSpeed(speed, limit)
}