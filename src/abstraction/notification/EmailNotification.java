package abstraction.notification;

public class EmailNotification extends Notification {
    private final String emailId;

    EmailNotification(String message, String emailId) {
        super(message);
        this.emailId = emailId;
    }

    @Override
    protected void sendMessage() {
        System.out.println("Sending " + message + " By Email  to " + emailId);
    }

    @Override
    protected void validate() {
        if (emailId == null || !emailId.contains("@")) {
            throw new IllegalArgumentException("Invalid emailId");
        }
    }
}
