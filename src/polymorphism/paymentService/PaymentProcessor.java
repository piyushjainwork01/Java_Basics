package polymorphism.paymentService;

public class PaymentProcessor {

    // ONE method handles ALL payment types - POLYMORPHISM!
    void process(Payment payment) {
        System.out.println("\n--- Processing Payment ---");
        payment.processPayment();
        payment.printReceipt();
        System.out.println("-------------------------");
    }

    void processBatch(Payment[] payments) {
        System.out.println("\n=== BATCH PROCESSING ===");
        for (Payment p : payments) {
            process(p);
        }
    }
}
