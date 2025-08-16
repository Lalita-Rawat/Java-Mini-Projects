import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsurancePolicy policy = null;

        System.out.print("Enter insurance type (health/life/travel): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter coverage amount: ");
        double coverage = sc.nextDouble();

        try {
            switch (type) {
                case "health":
                    policy = new HealthInsurance(name, age, coverage);
                    break;
                case "life":
                    policy = new LifeInsurance(name, age, coverage);
                    break;
                case "travel":
                    policy = new TravelInsurance(name, age, coverage);
                    break;
                default:
                    System.out.println("Invalid insurance type!");
                    sc.close();
                    return;
            }

            double premium = policy.calculatePremium();
            System.out.println(type + " insurance premium for " + name + ": " + premium);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
