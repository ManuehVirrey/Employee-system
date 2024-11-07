fun main() {
    val employees = arrayOf(
        Manager("John", 5000.0),
        Manager("Jane", 8000.0),
        Designer("Mark", 7000.0),
        Developer("Sarah", 6000.0)
    )

    for (employee in employees) {
        println("Employee Name: ${employee.name}, Salary: ${employee.salary}")
        if (employee is Developer) {
            employee.evaluatePerformance()
        }
    }
}