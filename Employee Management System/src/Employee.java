// Abstract Class, Encapsulation
public abstract class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) throws InvalidSalaryException {
        if (baseSalary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative!");
        }
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) throws InvalidSalaryException {
        if (baseSalary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative!");
        }
        this.baseSalary = baseSalary;
    }

    // Polymorphism: Method to be implemented by subclasses
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}
