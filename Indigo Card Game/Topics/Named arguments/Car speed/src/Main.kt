fun main(args: Array<String>) {
    fun limitSpeed(speed: Int, limit: Int) {

        if (speed > limit) println("Exceeds the limit by ${speed - limit} kilometers per hour")
        else println("Within the limit")
    }

    fun isNumeric(toCheck: String): Boolean {
        val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
        return toCheck.matches(regex)
    }

    var speed: Int = readln().toInt()
    var limitS: String = readln()
    var limit: Int = 60
    // if (limitS in "1234567890") limit = limitS.toInt()
    if (isNumeric(limitS)) limit = limitS.toInt()
    // println("$speed $limit ${speed - limit}")
    limitSpeed(speed, limit)
}