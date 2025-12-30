package abstraction;

public class UpiPayment extends  Payment{
    UpiPayment(double amount) {
        super(amount);
    }

    @Override
    void validate() {
        log("Validating UPI");

    }

    @Override
    void pay() {
        log("Paying " + amount + " via UPI");
    }
}
