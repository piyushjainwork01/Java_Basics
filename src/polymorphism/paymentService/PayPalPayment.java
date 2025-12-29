package polymorphism.paymentService;

public class PayPalPayment extends  Payment{
    String email;

    PayPalPayment(double amount, String transactionId, String email) {
        super(amount, transactionId);
        this.email = email;
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("PayPal Account: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Successful!");
    }
}
