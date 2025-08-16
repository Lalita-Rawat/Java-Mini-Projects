// Main Class: Demonstrates Abstract Class, Inheritance, Exception Handling
public class Main {
    public static void main(String[] args) {
        try {
            Vehicle v1 = new Car("Toyota", 120, 4);
            Vehicle v2 = new Bike("Yamaha", 80, true);

            v1.displayDetails();
            v2.displayDetails();

            // Uncomment to test exception
            // Vehicle v3 = new Car("Honda", -90, 4);

        } catch (InvalidVehicleDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
