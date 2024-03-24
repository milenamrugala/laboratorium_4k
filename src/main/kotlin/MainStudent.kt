import java.lang.IllegalArgumentException

fun main() {

    val group = Group()

    val first = Student("Milena", "Mrugała", "51251", 7) // ok, nie wchodzi do avg
    val second = Student("Monika", "Mrugała", "45845", 4)
    val third = Student("Adam", "Mrugała", "67467", 3)
    val fourth = Student("Henryk", "Fik", "12312", 4)
    val fifth = Student("Maria", "Fik", "12312", 5) // ok, nie wchodzi do avg
    val sixth = Student("Katarzyna", "Starzyńska", "43534", 4)

    try {
        group.add(first)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    group.add(second)
    group.add(third)
    group.add(fourth)
    group.add(sixth)

    try {
        group.add(fifth)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    println("Average grade is ${group.avg()} of ${group.number()} students.")

    println(first)
    println(second)


}



