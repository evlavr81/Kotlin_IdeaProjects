class Employee(val clothesSize: Int) {
    inner class Uniform {
        val uniformType: String = "suit"
        val uniformColor: String = "blue"
    }

    fun printUniformInfo() {
        println("The employee wears a ${this@Employee.Uniform().uniformColor} ${this@Employee.Uniform().uniformType} in size ${this@Employee.clothesSize}")
    }
}
