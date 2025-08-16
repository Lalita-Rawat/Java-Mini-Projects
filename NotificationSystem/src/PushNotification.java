// Subclass: Push Notification
public class PushNotification extends Notification {

    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Sending Push Notification to " + getRecipient() + ": " + getMessage());
    }
}
