// Abstract base class: TaxPayer
public abstract class TaxPayer {
    private String name;
    private double income;

    // Constructor
    public TaxPayer(String name, double income) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative.");
        }
        this.name = name;
        this.income = income;
    }

    // Encapsulation
    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    // Abstract method
    public abstract double calculateTax();
}
