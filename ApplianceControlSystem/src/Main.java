// Main Class - Appliance Control System
public class Main {
    public static void main(String[] args) {
        try {
            Appliance[] appliances = {
                new Fan("Orient"),
                new Light("Philips"),
                new AC("Samsung")
            };

            for (Appliance appliance : appliances) {
                appliance.turnOn();
            }

            System.out.println("--- Turning Off Appliances ---");

            for (Appliance appliance : appliances) {
                appliance.turnOff();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
