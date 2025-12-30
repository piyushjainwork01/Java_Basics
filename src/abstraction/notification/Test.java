package abstraction.notification;

public class Test {
    public static void main(String[] args) {
        Notification notification = new EmailNotification("You are fired","piyush@gmail.com");
        notification.send();
    }
}
