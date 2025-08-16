// Subclass: ContractEmployee
public class ContractEmployee extends Employee {

    // Constructor
    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    // Override bonus calculation
    @Override
    public double calculateBonus() {
        return getSalary() * 0.05; // 5% bonus
    }
}
