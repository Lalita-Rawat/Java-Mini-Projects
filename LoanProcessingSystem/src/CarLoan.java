// Subclass: Car Loan
public class CarLoan extends Loan {
    private int years;

    public CarLoan(double amount, double rate, int years) {
        super(amount, rate);
        if (years <= 0) {
            throw new IllegalArgumentException("Loan term must be greater than zero years.");
        }
        this.years = years;
    }

    @Override
    public double calculateInterest() {
        return (getAmount() * getRate() * years) / 100;
    }
}
