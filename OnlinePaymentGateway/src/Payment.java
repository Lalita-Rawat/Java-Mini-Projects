// Abstract Class - Payment
abstract class Payment {
    private double amount;

    public Payment(double amount) throws InvalidPaymentException {
        if (amount <= 0) {
            throw new InvalidPaymentException("Amount must be greater than zero.");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws InvalidPaymentException {
        if (amount <= 0) {
            throw new InvalidPaymentException("Amount must be greater than zero.");
        }
        this.amount = amount;
    }

    public abstract void processPayment() throws InvalidPaymentException;
}
