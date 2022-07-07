fun main() {
    val vowels = "aeiouy"
    var threeInRow = 0
    val word = readln()
    var i = 0
    while (i <= word.length - 3){
        if ((word[i] in vowels && word[i+1] in vowels && word[i+2] in vowels) ||
            (word[i] !in vowels && word[i+1] !in vowels && word[i+2] !in vowels)){
            threeInRow++
            i += 2
        } else i++
    }
    println(threeInRow)   
}