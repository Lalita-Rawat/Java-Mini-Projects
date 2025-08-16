// Subclass: Home Loan
public class HomeLoan extends Loan {
    private int years;

    public HomeLoan(double amount, double rate, int years) {
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
