package abstraction;

abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    protected void log(String msg) {
        System.out.println(msg);
    }


    abstract void validate();
    abstract void pay();
}
