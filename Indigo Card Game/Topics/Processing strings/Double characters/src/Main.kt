fun main() {
    val strIn = readln()
    var strOut = ""

    for (ch in strIn) {
        repeat(2) {
            strOut += ch
        }
    }
    println(strOut)    
}
