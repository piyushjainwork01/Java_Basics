package abstraction.notification;

abstract class Notification {
    protected String message;

    Notification(String message) {
        this.message = message;
    }

    public final void send() {
        validate();
        log("Sending notification");
        sendMessage();
        log("Notification sent");
    }

    abstract void sendMessage();

    abstract void validate();

    protected void log(String msg) {
        System.out.println(msg);
    }


}


