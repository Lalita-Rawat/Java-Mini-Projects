// Inheritance - UPI
class UPI extends Payment {
    private String upiId;

    public UPI(double amount, String upiId) throws InvalidPaymentException {
        super(amount);
        if (upiId == null || !upiId.contains("@")) {
            throw new InvalidPaymentException("Invalid UPI ID.");
        }
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment of $" + getAmount() + " for UPI ID: " + upiId);
    }
}
