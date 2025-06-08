public class Car implements Vehicle {
    private String brand;
    private int numberOfDoors;
    public Car(String brand, int numberOfDoors) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void start() {
        System.out.println("Car is starting with key ignition...");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping using hydraulic brakes...");
    }
    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
 }
