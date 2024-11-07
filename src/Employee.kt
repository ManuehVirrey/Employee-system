interface Evaluable{
    fun evaluatePerformance()
}

abstract class Employee : Evaluable{
    abstract val name: String
    abstract val salary: Double

    abstract fun work()
    abstract fun calculateAnnualBonus()

    fun details() {
        println("Name of the employee: $name")
        print("Salary of the employee: $salary")
    }

}

class Developer(override val name: String, override val salary: Double) : Employee(), Evaluable {
    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus() {
        println("The annual bonus is: ${salary * 0.1}, the total is ${salary + (salary * 0.1)}")
    }

    override fun evaluatePerformance() {
        println("The employee $name is developer and is performing well.")
    }
}

class Manager(override val name: String, override val salary: Double) : Employee() {
    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus() {
        println("The annual bonus is: ${salary * 0.2}, the total is ${salary + (salary * 0.2)}")
    }

    override fun evaluatePerformance() {
        TODO("No se implementará de momento")
    }
}

class Designer(override val name: String, override val salary: Double) : Employee() {
    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus() {
        println("The annual bonus is: ${salary * 0.15}, the total is ${salary + (salary * 0.15)}")
    }

    override fun evaluatePerformance() {
        TODO("No se implementará por el momento")
    }
}