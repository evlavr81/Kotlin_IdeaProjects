import kotlin.random.Random

fun main() {
    val conditions = readln().split(" ").map { it.toInt() }.toMutableList()
    val uppercase = ('A'..'Z').toList()
    val lowercase = ('a'..'z').toList()
    val digit = ('0'..'9').toList()
    var password = ""

    // Function that return one of three STRING meaning:
    // upp - uppercase, low - lowercase, dig - digits,
    fun typeRoll(): String {
        val charTypeList = listOf("upp", "low", "dig")
        return charTypeList[Random.nextInt(0, 3)]
    }

    // Function that return uppercase, lowercase or digit char
    fun charRoll(typeChar: String): Char {
        var resultChar = '*'
        // uppercase char
        if (typeChar == "upp"){
            resultChar = uppercase[Random.nextInt(0, uppercase.size)]
        // lowercase char
        } else if (typeChar == "low") {
            resultChar = lowercase[Random.nextInt(0, lowercase.size)]
        // digit
        } else if (typeChar == "dig"){
            resultChar = digit[Random.nextInt(0, digit.size)]
        }
        return resultChar
    }

    while(password.length < conditions[3]){
        var typ = typeRoll() // upp, low or dig
        var ch  = charRoll(typ) // get a random char
        if (password.length == 0  || ch != password.last()) { // if char not the same as last
            if(typ == "upp" && conditions[0] > 0){
                conditions[0]--
                password += ch
            } else if(typ == "low" && conditions[1] > 0){
                conditions[1]--
                password += ch
            } else if(typ == "dig" && conditions[2] > 0){
                conditions[2]--
                password += ch
            } else if (conditions[0] == 0 && conditions[1] == 0 && conditions[2] == 0){
                password += ch
            }
        }
    }

    println("$password")    
}
