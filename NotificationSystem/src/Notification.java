// Abstract base class: Notification
public abstract class Notification {
    private String recipient;
    private String message;

    // Constructor
    public Notification(String recipient, String message) {
        if (recipient == null || recipient.isEmpty()) {
            throw new IllegalArgumentException("Recipient cannot be empty.");
        }
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Message cannot be empty.");
        }
        this.recipient = recipient;
        this.message = message;
    }

    // Getters
    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    // Abstract method to send notification
    public abstract void send();
}
