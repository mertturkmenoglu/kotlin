package example_18

fun main() {
    val firstVector = Vector(2f, 3f)
    val secondVector = Vector(3f, 4f)

    val thirdVector = firstVector add secondVector
    thirdVector.printVector()
}