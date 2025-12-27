package inheritance;

public class Test {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 2024, 4, 100);
        tesla.start();
        System.out.println(tesla.brand);  // Accessing inherited member
    }

    /* TODO What you're learning:
        Constructor chaining with super()
        Overriding methods at multiple levels
        Accessing inherited members*/
}