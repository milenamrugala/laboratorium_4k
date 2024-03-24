import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun add(firstNumber: Double, secondNumber: Double): String {
    return (firstNumber + secondNumber).toString()
}

fun sub(firstNumber: Double, secondNumber: Double): String {
    return (firstNumber - secondNumber).toString()
}

fun mul(firstNumber: Double, secondNumber: Double): String {
    return (firstNumber * secondNumber).toString()
}

fun div(firstNumber: Double, secondNumber: Double): String {
    if (secondNumber == 0.0) {
        throw ArithmeticException("Impossible operation. Division by zero.")
    }
    return (firstNumber / secondNumber).toString()
}

fun power(number: Double, exponent: Double): String {
    return number.pow(exponent).toString()
}

fun square(number: Double): String {
    if (number < 0.0) {
        throw ArithmeticException("Impossible operation. Negative number provided.")
    }
    return sqrt(number).toString()
}

fun main() {
    println("Please enter +, -, *, /, ^ or √ ")
    val reader = Scanner(System.`in`)
    val option = reader.nextLine()

    when (option) {
        "+" -> {
            println("Addition, enter two numbers: ")
            val number = reader.nextDouble()
            val secondNumber = reader.nextDouble()
            println("Result: ${add(number, secondNumber)}") //ok
        }

        "-" -> {
            println("Subtraction, enter two numbers: ")
            val number = reader.nextDouble()
            val secondNumber = reader.nextDouble()
            println("Result: ${sub(number, secondNumber)}") //ok
        }

        "*" -> {
            println("Multiplication, enter two numbers: ")
            val number = reader.nextDouble()
            val secondNumber = reader.nextDouble()
            println("Result: ${mul(number, secondNumber)}") //ok
        }

        "/" -> {
            println("Division, enter two numbers: ")
            val number = reader.nextDouble()
            val secondNumber = reader.nextDouble()
            try {
                println("Result: ${div(number, secondNumber)}")
            } catch (e: ArithmeticException) {
                println("Error: ${e.message}")
            }
        }

        "^" -> {
            println("Power, firstly enter base and then exponent: ")
            val number = reader.nextDouble()
            val exponent = reader.nextDouble()
            println("Result: ${power(number, exponent)}") //ok
        }

        "√" -> {
            println("Square root, enter one number: ")
            val number = reader.nextDouble()
            try {
                println("Result: ${square(number)}") //ok
            } catch (e: java.lang.ArithmeticException) {
                println("Error: ${e.message}")
            }
        }

        else -> {
            println("Error: Invalid operation.") //ok
        }
    }
}