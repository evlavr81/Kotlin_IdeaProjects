fun main() {
    val threeDigitInt = readln().toInt()
    val firstDigit = threeDigitInt / 100
    val secondDigit = threeDigitInt / 10 % 10
    val thirdigit = threeDigitInt % 10
    println(firstDigit + secondDigit + thirdigit)
}
