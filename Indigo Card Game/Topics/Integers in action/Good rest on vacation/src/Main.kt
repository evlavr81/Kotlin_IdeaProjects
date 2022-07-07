fun main() {
    val days: Int = readln().toInt()
    val food: Int = readln().toInt()
    val flight: Int = readln().toInt()
    val hotel: Int = readln().toInt()
    val total = days * food + flight * 2 + hotel * (days - 1)
    println(total)
}
