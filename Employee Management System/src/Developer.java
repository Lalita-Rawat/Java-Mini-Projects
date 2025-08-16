// Inheritance, Polymorphism
public class Developer extends Employee {
    private double overtimePay;

    public Developer(String name, int id, double baseSalary, double overtimePay) throws InvalidSalaryException {
        super(name, id, baseSalary);
        if (overtimePay < 0) {
            throw new InvalidSalaryException("Overtime pay cannot be negative!");
        }
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + overtimePay;
    }
}
