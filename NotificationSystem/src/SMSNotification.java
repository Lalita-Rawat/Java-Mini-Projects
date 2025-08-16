// Subclass: SMS Notification
public class SMSNotification extends Notification {

    public SMSNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + getRecipient() + ": " + getMessage());
    }
}
