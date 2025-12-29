package polymorphism.paymentService;

public class TestPaymentSystem {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Create different payment types
        Payment p1 = new CreditCardPayment(150.00, "TXN001", "1234567890123456");
        Payment p2 = new PayPalPayment(75.50, "TXN002", "user@email.com");
        Payment p3 = new CryptoPayment(200.00, "TXN003", "0xABC123DEF456");

        // Process each payment - same method, different behaviors!
        processor.process(p1);
        processor.process(p2);
        processor.process(p3);

        // Batch processing
        Payment[] payments = {
                new CreditCardPayment(99.99, "TXN004", "9876543210987654"),
                new PayPalPayment(50.00, "TXN005", "another@email.com"),
                new CryptoPayment(300.00, "TXN006", "0xXYZ789ABC012")
        };

        processor.processBatch(payments);
    }

}
