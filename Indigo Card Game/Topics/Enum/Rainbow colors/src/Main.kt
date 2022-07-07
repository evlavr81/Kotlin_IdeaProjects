enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");
}

fun isRainbow(color: String) : Boolean {
    for (enum in Rainbow.values()) {
        if (color.uppercase() == enum.name) return true
    }
    return false
}

fun main() {
    val inputColor: String = readln() //String
    println(isRainbow(inputColor))
}


