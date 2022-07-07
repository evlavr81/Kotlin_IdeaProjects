fun main() {
    val group1 = readln().toInt()
    val group2 = readln().toInt()
    val group3 = readln().toInt()
    val groupList = listOf<Int>(group1, group2, group3)
    var result = 0
    for (gr in groupList){
        var intPart = gr / 2
        if (gr % 2 == 0) {
            result += intPart
        } else {
            result += intPart + 1
        }
    }
    println(result)
}
