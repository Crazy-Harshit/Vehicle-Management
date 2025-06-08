public class Bike implements Vehicle {
    private String brand;
    private boolean hasGear;
    public Bike(String brand, boolean hasGear) {
        this.brand = brand;
        this.hasGear = hasGear;
    }
    @Override
    public void start() {
        System.out.println("Bike is starting with kick or self-start...");
    }
    @Override
    public void stop() {
        System.out.println("Bike is stopping using disc brakes...");
    }
    @Override
    public void displayInfo() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
 }
