public class Truck implements Vehicle {
    private String brand;
    private double loadCapacity;
    public Truck(String brand, double loadCapacity) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void start() {
        System.out.println("Truck is starting with diesel engine...");
    }
    @Override
    public void stop() {
        System.out.println("Truck is stopping with air brakes...");
    }
    @Override
    public void displayInfo() {
        System.out.println("Truck Brand: " + brand);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
 }
