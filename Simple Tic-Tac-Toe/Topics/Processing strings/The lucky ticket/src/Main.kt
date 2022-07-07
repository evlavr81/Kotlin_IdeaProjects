fun main() {
    val ticket = readln()
    val ticketList = mutableListOf<Int>()
    for (charValue in ticket){
        ticketList.add(charValue.digitToInt())
    }  
    var sumL = ticketList[0] + ticketList[1] + ticketList[2]
    var sumR = ticketList[3] + ticketList[4] + ticketList[5]
    if (sumL == sumR) {
        println("Lucky")
    } else {
        println("Regular")
    }
}
