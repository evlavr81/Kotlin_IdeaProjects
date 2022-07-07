fun main() {
    var strIn = readln()
    val halfLen = strIn.length / 2
    if (strIn.length % 2 != 0) {
        // println("Odd word. Deleted symbols: ${strIn[halfLen + 1]}")
        val newStr = strIn.removeRange(halfLen, halfLen + 1)
        println(newStr)
    } else {
        // println("Even word. Deleted symbols: ${strIn[halfLen - 1]}${strIn[halfLen]}")
        val newStr = strIn.removeRange(halfLen - 1, halfLen + 1)
        println(newStr)
    }
}
