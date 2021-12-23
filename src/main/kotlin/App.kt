import shape.Circle
import shape.Rectangle
import shape.Triangle
import utils.StarGeneratorUtils

class App {
    fun run() {
        printHeader()
        inputMenu()
    }

    private fun printHeader() {
        println(
            """
            ======================================
            Console app for Calculating Area in 2D
            ======================================
            1. Calculate Rectangle Area
            2. Calculate Circle Area
            3. Calculate Triangle Area
            4. Print Stars
            ======================================
            Enter menu ? (1/2/3/4)
            ======================================
        """.trimIndent()
        )
    }

    private fun inputMenu() {
        readLine()?.let {
            openMenu(it)
        }
    }

    private fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                //open menu rectangle
                openMenuRectangle()
            }
            "2" -> {
                //open menu circle
                openMenuCircle()
            }
            "3" -> {
                //open menu Triangle
                openMenuTriangle()
            }
            "4" -> {
                openMenuPrintStar()
            }
            else -> {
                //rerun the app
                println("No menu matches")
                run()
            }
        }
    }

    private fun openMenuPrintStar() {
        println("Enter Total Star (max stars = 20) = ")
        val totalStar = getValueFromUser().toInt()
        StarGeneratorUtils().printStars(totalStar)
    }

    private fun openMenuTriangle() {
        println("Enter Base = ")
        val base = getValueFromUser()
        println("Enter Height = ")
        val height = getValueFromUser()
        println("Enter Hypotenusa = ")
        val hypotenusa = getValueFromUser()
        val triangle = Triangle(base, height, hypotenusa)
        triangle.printShapeName()
        triangle.printTotalAreaAndCircular()
    }

    private fun openMenuCircle() {
        println("Enter Radius = ")
        val radius = getValueFromUser()
        val circle = Circle(radius)
        circle.printShapeName()
        circle.printTotalAreaAndCircular()
    }

    private fun openMenuRectangle() {
        println("Enter Length = ")
        val length = getValueFromUser()
        println("Enter Width")
        val width = getValueFromUser()
        val rectangle = Rectangle(length, width)
        rectangle.printShapeName()
        rectangle.printTotalAreaAndCircular()
    }

    private fun getValueFromUser(): Double {
        return try {
            readLine()?.toDouble() ?: 0.0
        } catch (e: NumberFormatException) {
            0.0
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}