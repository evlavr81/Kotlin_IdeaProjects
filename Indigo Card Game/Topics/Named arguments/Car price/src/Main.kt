
//fun main(){

fun carPrice(old: Int = 5,
             kilometers : Int = 100_000,
             maximumSpeed: Int = 120,
             automatic: Boolean = false){
    val newCarPrice = 20_000 // $
    var resultPrice = newCarPrice

    // Every year the price of the car decreases by 2000$.
    if (old > 0) resultPrice = resultPrice - (old * 2_000)

    // The price lowers by 200$ for every 10000 kilometers that the car passed.
    // For example, for 19999 km, the price decreases by 200 dollars,
    //but for 20000 km the price lowers by 400 dollars.
    if (kilometers > 0) resultPrice = resultPrice - (kilometers / 10_000) * 200

    // The price goes down by 100$ for every kilometer per hour less than 120 km/h
    //and increases by 100$ for every kilometer per hour greater than 120 km/h.
    if (maximumSpeed > 120) resultPrice = resultPrice + (maximumSpeed - 120) * 100
    else if (maximumSpeed < 120) resultPrice = resultPrice - (120 - maximumSpeed) * 100

    // If the car has automatic transmission, the price of the car goes up by 1500$,
    //otherwise, it remains the same.
    if (automatic) resultPrice += 1500

    // The function should print the price of the car is on the second-hand market.
    println(resultPrice)
}
    //carPrice(old = 5, kilometers = 100_000, maximumSpeed = 120, automatic = false)
    //carPrice(old = 0, kilometers = 0, maximumSpeed = 120, automatic = false)
//}