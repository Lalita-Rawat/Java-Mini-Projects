// Subclass: PermanentEmployee
public class PermanentEmployee extends Employee {

    // Constructor
    public PermanentEmployee(String name, double salary) {
        super(name, salary);
    }

    // Override bonus calculation
    @Override
    public double calculateBonus() {
        return getSalary() * 0.1; // 10% bonus
    }
}
