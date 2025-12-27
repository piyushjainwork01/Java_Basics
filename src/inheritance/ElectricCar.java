package inheritance;

public class ElectricCar extends  Car{
    int battaryCapacity;
    ElectricCar(String brand, int year, int doors, int battaryCapacity) {
        super(brand, year, doors);
        this.battaryCapacity = battaryCapacity;
    }

    @Override
    void start() {
        System.out.println("Electric car silently starting...");
        // Notice: NOT calling super.start() - perfectly valid
    }
}
