fun main() {
    val strList = readln().split(" ")
    var maxLen = 0
    var longestWord = ""
    for (elem in strList) {
        // println("$elem=${elem.length}")
        if (elem.length > maxLen) {
            maxLen = elem.length
            longestWord = elem
        }
    }
    println(longestWord)   
}
