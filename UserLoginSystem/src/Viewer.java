// Subclass: Viewer
public class Viewer extends User {

    public Viewer(String username, String password) {
        super(username, password);
    }

    @Override
    public void login(String username, String password) throws Exception {
        if (!username.equals(getUsername()) || !password.equals(getPassword())) {
            throw new Exception("Viewer login failed: Incorrect credentials.");
        }
        System.out.println("Viewer " + getUsername() + " logged in successfully!");
    }
}
