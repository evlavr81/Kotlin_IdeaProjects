import java.util.Scanner

fun main(args : Array<String>) {
    // put your code here
    // val reader = Scanner(System.`in`)
    // var inputNum = reader.nextInt()
    var inputNum = readln().toInt()
    // var inputNum = 999173
    var tens = inputNum % 100 / 10
    println(tens)
}