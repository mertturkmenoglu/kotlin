package example_18

class Vector(var x: Float = 0f, var y: Float = 0f) {
    infix fun add(other: Vector): Vector {
        return Vector(this.x + other.x, this.y + other.y)
    }

    fun printVector() {
        println("$x\t$y")
    }
}