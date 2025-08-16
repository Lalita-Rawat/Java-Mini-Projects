import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> libraryBooks = new ArrayList<>();

        // Initial library books
        libraryBooks.add("Java Programming");
        libraryBooks.add("Data Structures");
        libraryBooks.add("Algorithms");
        libraryBooks.add("Database Systems");
        libraryBooks.add("Networking");

        System.out.print("Enter member type (student/teacher/guest): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter member name: ");
        String name = sc.nextLine();

        LibraryMember member;
        switch (type) {
            case "student":
                member = new Student(name);
                break;
            case "teacher":
                member = new Teacher(name);
                break;
            case "guest":
                member = new Guest(name);
                break;
            default:
                System.out.println("Invalid member type!");
                sc.close();
                return;
        }

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. View Borrowed Books");
            System.out.println("4. View Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    try {
                        member.borrowBook(libraryBooks);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        member.returnBook(libraryBooks);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(member.getName() + " borrowed: " + member.getBorrowedBooks());
                    break;
                case 4:
                    System.out.println("Available books: " + libraryBooks);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
