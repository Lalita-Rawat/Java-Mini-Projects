// Inheritance - CreditCard
class CreditCard extends Payment {
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) throws InvalidPaymentException {
        super(amount);
        if (cardNumber == null || cardNumber.length() != 16) {
            throw new InvalidPaymentException("Invalid credit card number.");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card payment of $" + getAmount() + " for card: " + cardNumber);
    }
}
