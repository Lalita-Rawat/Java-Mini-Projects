// Subclass: GoogleAccount
public class GoogleAccount extends Account {
    public GoogleAccount(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) throws Exception {
        if (!getUsername().equals(username) || !getPassword().equals(password)) {
            throw new Exception("Invalid Google account credentials.");
        }
        System.out.println("Google login successful for " + username);
        return true;
    }
}
