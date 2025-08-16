// Subclass: Education Loan
public class EducationLoan extends Loan {
    private int years;

    public EducationLoan(double amount, double rate, int years) {
        super(amount, rate);
        if (years <= 0) {
            throw new IllegalArgumentException("Loan term must be greater than zero years.");
        }
        this.years = years;
    }

    @Override
    public double calculateInterest() {
        // Education loans might have lower interest
        return (getAmount() * (getRate() - 1) * years) / 100;
    }
}
