import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character character = null;

        System.out.print("Enter character type (warrior/mage/archer): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter health: ");
        int health = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter weapon: ");
        String weapon = sc.nextLine();

        try {
            switch (type) {
                case "warrior":
                    character = new Warrior(name, health, weapon);
                    break;
                case "mage":
                    character = new Mage(name, health, weapon);
                    break;
                case "archer":
                    character = new Archer(name, health, weapon);
                    break;
                default:
                    System.out.println("Invalid character type!");
                    sc.close();
                    return;
            }

            System.out.println("\nCharacter created: " + character.getName());
            character.attack();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
