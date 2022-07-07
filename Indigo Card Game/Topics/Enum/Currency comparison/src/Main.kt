enum class Country(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar");
}

// Check if country in enum Country
fun isCounry(country: String): Boolean {
    for (enum in Country.values()) {
        if (country.uppercase() == enum.name) return true
    }
    return false
}

// Return country currency from enum Country
fun getCur (country: String): String {
    var curr = ""
    for (enum in Country.values()) {
        if (country.uppercase() == enum.name) curr = enum.currency
    }
    return curr
}

fun isTheSameCur(c1: String, c2: String): Boolean {
    // Check if both countries in enum Country
    if (isCounry(c1) && isCounry(c2)) {
        // Check if both currency the same
        if (getCur(c1) == getCur(c2)) return true
    }
    return false
}

fun main() {
    val twoC = readln().split(" ")
    println(isTheSameCur(twoC[0], twoC[1]))
}