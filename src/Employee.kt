abstract class Employee {
    abstract val name: String
    abstract val salary: Double

    abstract fun work()
    abstract fun calculateAnnualBonus()

    fun details() {
        println("Name of the employee: $name")
        println("Salary of the employee: $salary")
    }
}

class Developer(override val name: String, override val salary: Double) : Employee() {
    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus() {
        println("The annual bonus is: ${salary * 0.1}, the total is ${salary + (salary * 0.1)}")
    }
}

class Manager(override val name: String, override val salary: Double) : Employee() {
    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus() {
        println("The annual bonus is: ${salary * 0.2}, the total is ${salary + (salary * 0.2)}")
    }
}

class Designer(override val name: String, override val salary: Double) : Employee() {
    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus() {
        println("The annual bonus is: ${salary * 0.15}, the total is ${salary + (salary * 0.15)}")
    }
}