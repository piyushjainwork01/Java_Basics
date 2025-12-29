package polymorphism.paymentService;

public abstract class Payment {
    double amount;
    String transactionId;

    Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    // Abstract method - must be implemented by children
    abstract void processPayment();

    void printReceipt() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
    }
}
