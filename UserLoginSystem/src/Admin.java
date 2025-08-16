// Subclass: Admin
public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void login(String username, String password) throws Exception {
        if (!username.equals(getUsername()) || !password.equals(getPassword())) {
            throw new Exception("Admin login failed: Incorrect credentials.");
        }
        System.out.println("Admin " + getUsername() + " logged in successfully!");
    }
}
