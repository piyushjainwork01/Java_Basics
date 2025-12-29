package polymorphism.paymentService;

public class CreditCardPayment extends Payment{
    String cardNumber;

    CreditCardPayment(double amount, String transactionId,String cardNumber) {
        super(amount, transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card: ****" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Successful!");
    }
}
