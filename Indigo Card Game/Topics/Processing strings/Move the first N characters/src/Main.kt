fun main() {
    val inputData = readln().split(" ")
    val s = inputData[0]
    val n = inputData[1].toInt()

    var mutL: MutableList<Char> = mutableListOf<Char>()
    var shifted = ""

    if (n <= s.length){
        for(num in n until s.length){
            mutL.add(s[num])
        }
        for(num in 0 until n){
            mutL.add(s[num])
        }
    } else {
        mutL = s.toMutableList()
    }
    shifted = mutL.joinToString("")
    println(shifted)
}