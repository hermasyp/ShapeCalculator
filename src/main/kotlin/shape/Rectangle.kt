package shape

class Rectangle(
    private val length: Double,
    private val width: Double
) : Shape("Rectangle") {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculateCircular(): Double {
        return 2 * (length + width)
    }
}