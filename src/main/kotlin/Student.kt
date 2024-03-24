class Student(
    private var firstName: String,
    private var lastName: String,
    private var id: String,
    private var grade: Int
) {

    override fun toString(): String {
        return "imię: $firstName, nazwisko: $lastName, numer indeksu: $id, ocena: $grade"
    }

    fun getGrade(): Int {
        return grade
    }

    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun getId(): String {
        return id
    }

    fun setGrade(grade: Int) {
        this.grade = grade
    }


    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName

    }
}