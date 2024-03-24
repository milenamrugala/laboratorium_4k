class Group {
    private val students = mutableMapOf<String, Student>()

    fun add(student: Student) {
        if (students.containsKey(student.getId())) {
            throw IllegalArgumentException("Student ${student.getId()} already exists, cannot add a new student.")
        }
        if (student.getGrade() !in 2..5) {
            throw IllegalArgumentException("Invalid grade. The range of grade is 2-5.")
        }
        students[student.getId()] = student
    }

    fun avg(): Double {
        var sum = 0.0
        for ((_, student) in students) {
            sum += student.getGrade().toDouble()
        }
        return sum / students.size
    }

    fun number(): Int {
        return students.size
    }
}