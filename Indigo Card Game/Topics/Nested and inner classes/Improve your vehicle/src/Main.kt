class Vehicle (val name: String) {
    // add name
    // val name: String = name
    // create constructor
        
    inner class Engine (val horsePower: Int) {
        // add horsePower
        // val horsePower: Int = horsePower
        // create constructor

        fun start() {
            println("RRRrrrrrrr....")
        }

        fun printHorsePower() {
            println("The ${this@Vehicle.name} vehicle has ${this@Engine.horsePower} horsepower.")
        }
    }
}
