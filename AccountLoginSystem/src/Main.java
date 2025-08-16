import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.print("Enter account type (google/facebook/twitter): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            switch (type) {
                case "google":
                    account = new GoogleAccount(username, password);
                    break;
                case "facebook":
                    account = new FacebookAccount(username, password);
                    break;
                case "twitter":
                    account = new TwitterAccount(username, password);
                    break;
                default:
                    System.out.println("Invalid account type!");
                    sc.close();
                    return;
            }

            System.out.print("Enter login username: ");
            String loginUser = sc.nextLine();
            System.out.print("Enter login password: ");
            String loginPass = sc.nextLine();

            account.login(loginUser, loginPass);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
