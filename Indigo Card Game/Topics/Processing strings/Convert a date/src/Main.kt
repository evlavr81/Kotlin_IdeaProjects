fun main() {
    val strIn = readln()
    val dateList = strIn.split("-")
    println("${dateList[1]}/${dateList[2]}/${dateList[0]}")  
}
