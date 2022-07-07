import kotlin.math.pow
fun main() {
    fun deposit (amount: Int = 1000,
                 percent: Int = 5,
                 years: Int = 10): Int {
        var finalAmount = amount.toDouble() * (1.0 + percent.toDouble() / 100).pow(years.toDouble())
        //println("$amount $percent $years")
        //println(1.0 + percent.toDouble() / 100)
        //println((1.0 + percent.toDouble() / 100).pow(years.toDouble()))
        //var finalAmount = (5).toDouble().pow(2.toDouble())
        //var finalAmount = 20000 * 1.05.pow(10.toDouble())
        return finalAmount.toInt()
    }

    //println(deposit(amount = 20_000))
    //println(deposit(percent = 10))

    var param = readln()
    var value = readln().toInt()
    when (param){
        "amount" -> println(deposit(amount = value))
        "percent" -> println(deposit(percent = value))
        "years" -> println(deposit(years = value))
    }

}