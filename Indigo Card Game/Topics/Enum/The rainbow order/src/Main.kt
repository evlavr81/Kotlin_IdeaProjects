enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");

    fun printOrderNum() {
        println(ordinal+1)
    }
}

fun searchColor(color: String) {
    for (enum in Rainbow.values()) {
        if (color.uppercase() == enum.name) {
            enum.printOrderNum()
        }
    }
}

fun main() {
    val clr = readln()
    searchColor(clr)
}