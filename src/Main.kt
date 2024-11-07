fun main() {
    val employees = arrayOf(
        Manager("John", 5000.0),
        Manager("Jane", 8000.0),
        Designer("Mark", 7000.0),
        Developer("Sarah", 6000.0),
        Developer("Jake", 7000.0)
    )

    for (employee in employees) {
        print(employee.details())
        employee.work()
        employee.calculateAnnualBonus()
        println()
        if (employee is Developer) {
            employee.evaluatePerformance()
            println()
        }
    }
}