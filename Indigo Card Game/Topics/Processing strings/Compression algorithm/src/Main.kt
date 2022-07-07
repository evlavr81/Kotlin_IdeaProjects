fun main() {
    val dnaIn = readln()
    var dnaOut: MutableList<String> = mutableListOf()
    var counter = 1

    // Empty input string
    if (dnaIn.length == 0) {
        // println ("empty dna")
    // Input string has 1 char
    } else if (dnaIn.length == 1) {
        dnaOut.add(dnaIn[0].toString())
        dnaOut.add(counter.toString())
    // Input string has more than 1 char
    } else {
        dnaOut.add(dnaIn[0].toString())
        for (n in 1 until dnaIn.length) {
            if (dnaIn[n-1] == dnaIn[n]) {
                counter++

            } else {
                dnaOut.add(counter.toString())
                dnaOut.add(dnaIn[n].toString())
                counter = 1
            }
            if (n == dnaIn.length - 1) dnaOut.add(counter.toString())
        }
    }

    println("${dnaOut.joinToString("")}")
}