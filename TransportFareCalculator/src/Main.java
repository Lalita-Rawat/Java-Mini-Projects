import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transport transport = null;

        System.out.print("Enter transport type (bus/train/taxi): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter fare per km: ");
        double farePerKm = sc.nextDouble();

        try {
            switch (type) {
                case "bus":
                    transport = new Bus(distance, farePerKm);
                    break;
                case "train":
                    transport = new Train(distance, farePerKm);
                    break;
                case "taxi":
                    transport = new Taxi(distance, farePerKm);
                    break;
                default:
                    System.out.println("Invalid transport type!");
                    System.exit(0);
            }

            double totalFare = transport.calculateFare();
            System.out.println("Total fare for " + type + ": " + totalFare);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
