// Main class to test the User Login System
public class Main {
    public static void main(String[] args) {
        try {
            // Creating objects
            User admin = new Admin("admin123", "adminPass");
            User editor = new Editor("editor456", "editorPass");
            User viewer = new Viewer("viewer789", "viewerPass");

            // Testing logins
            admin.login("admin123", "adminPass");
            editor.login("editor456", "editorPass");
            viewer.login("viewer789", "viewerPass");

            // Example of wrong password (will throw exception)
            viewer.login("viewer789", "wrongPass");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
