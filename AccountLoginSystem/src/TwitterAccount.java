// Subclass: TwitterAccount
public class TwitterAccount extends Account {
    public TwitterAccount(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) throws Exception {
        if (!getUsername().equals(username) || !getPassword().equals(password)) {
            throw new Exception("Invalid Twitter account credentials.");
        }
        System.out.println("Twitter login successful for " + username);
        return true;
    }
}
