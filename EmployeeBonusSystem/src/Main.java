// Main class to test Employee Bonus System
public class Main {
    public static void main(String[] args) {
        try {
            Employee[] employees = {
                new PermanentEmployee("Alice", 50000),
                new ContractEmployee("Bob", 30000)
            };

            for (Employee e : employees) {
                System.out.println(e.getName() + " bonus: " + e.calculateBonus());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
