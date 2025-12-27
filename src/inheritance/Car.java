package inheritance;

public class Car extends Vehicle{
    int doors;

    Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    void start() {
        super.start();  // Call parent method first
        System.out.println("Car engine started");
    }



}
