// Abstract base class: Loan
public abstract class Loan {
    private double amount;
    private double rate; // annual interest rate in %

    // Constructor
    public Loan(double amount, double rate) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }
        if (rate <= 0) {
            throw new IllegalArgumentException("Interest rate must be greater than zero.");
        }
        this.amount = amount;
        this.rate = rate;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public double getRate() {
        return rate;
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();
}
