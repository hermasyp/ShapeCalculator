package shape

import kotlin.math.pow

class Circle(private val radius: Double) : Shape("Circle") {
    override fun calculateArea(): Double {
        return Math.PI * radius.pow(2)
    }

    override fun calculateCircular(): Double {
        return Math.PI * (radius * 2)
    }
}