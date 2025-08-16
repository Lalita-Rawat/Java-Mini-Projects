// Inheritance - NetBanking
class NetBanking extends Payment {
    private String accountNumber;

    public NetBanking(double amount, String accountNumber) throws InvalidPaymentException {
        super(amount);
        if (accountNumber == null || accountNumber.length() < 6) {
            throw new InvalidPaymentException("Invalid account number.");
        }
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing NetBanking payment of $" + getAmount() + " for account: " + accountNumber);
    }
}
