// Subclass: FacebookAccount
public class FacebookAccount extends Account {
    public FacebookAccount(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) throws Exception {
        if (!getUsername().equals(username) || !getPassword().equals(password)) {
            throw new Exception("Invalid Facebook account credentials.");
        }
        System.out.println("Facebook login successful for " + username);
        return true;
    }
}
