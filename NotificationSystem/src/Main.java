// Main class to test Notification System
public class Main {
    public static void main(String[] args) {
        try {
            Notification[] notifications = {
                new EmailNotification("alice@example.com", "Your order has been shipped."),
                new SMSNotification("+9779812345678", "Your OTP is 1234."),
                new PushNotification("User123", "You have a new message.")
            };

            for (Notification n : notifications) {
                n.send();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
