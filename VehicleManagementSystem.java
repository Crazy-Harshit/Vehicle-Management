public class VehicleManagementSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 4);
        Vehicle bike = new Bike("Yamaha", true);
        Vehicle truck = new Truck("Volvo", 18.5);
        System.out.println(" Car Details ");
        car.start();
        car.displayInfo();
        car.stop();
        System.out.println("\n Bike Details ");
        bike.start();
        bike.displayInfo();
        bike.stop();
        System.out.println("\n Truck Details ");
        truck.start();
        truck.displayInfo();
        truck.stop();
    }
 }