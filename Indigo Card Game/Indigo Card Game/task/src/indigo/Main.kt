package indigo

fun main() {
    val ranks = listOf<String>("A","2","3","4","5","6","7","8","9","10","J","Q","K")
    // val suits = listOf<String>("\u2666", "\u2665", "\u2664", "\u2663")
    val suits = listOf<String>("♠","♥","♦","♣")
    println(ranks.joinToString(" "))
    println()
    println(suits.joinToString(" "))
    println()
    for (s in suits) {
        for (r in ranks) {
            print("$r$s ")
        }
    }
}