package polymorphism.paymentService;

public class BankPayment extends  Payment{
    String bankAccountNumber;

    BankPayment(double amount, String transactionId,String bankAccountNumber) {
        super(amount, transactionId);
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Bank Payment...");
        System.out.println("Bank Account Number: " + bankAccountNumber);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Successful!");
    }
}
