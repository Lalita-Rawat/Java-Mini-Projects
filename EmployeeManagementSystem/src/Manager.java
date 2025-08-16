// Inheritance, Polymorphism
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) throws InvalidSalaryException {
        super(name, id, baseSalary);
        if (bonus < 0) {
            throw new InvalidSalaryException("Bonus cannot be negative!");
        }
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
