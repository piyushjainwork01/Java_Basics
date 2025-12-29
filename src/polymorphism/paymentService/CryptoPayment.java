package polymorphism.paymentService;

public class CryptoPayment extends  Payment{
    String walletId;

    CryptoPayment(double amount, String transactionId,String walletId) {
        super(amount, transactionId);
        this.walletId = walletId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Crypto Payment...");
        System.out.println("Crypto Account Id: " + walletId);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Successful!");
    }
}
