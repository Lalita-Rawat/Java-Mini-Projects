// Polymorphism & Main Execution
public class Main {
    public static void main(String[] args) {
        try {
            Payment[] payments = new Payment[3];
            payments[0] = new CreditCard(1500, "1234567812345678");
            payments[1] = new UPI(500, "user@upi");
            payments[2] = new NetBanking(2500, "ACC123456");

            for (Payment payment : payments) {
                payment.processPayment();
            }
        } catch (InvalidPaymentException e) {
            System.out.println("Payment Error: " + e.getMessage());
        }
    }
}
