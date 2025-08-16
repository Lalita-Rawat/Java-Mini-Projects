// Base class: Employee Bonus System
public class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    // Method to calculate bonus (Overridden in subclasses)
    public double calculateBonus() {
        return 0;
    }
}
