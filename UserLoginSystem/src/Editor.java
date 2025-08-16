// Subclass: Editor
public class Editor extends User {

    public Editor(String username, String password) {
        super(username, password);
    }

    @Override
    public void login(String username, String password) throws Exception {
        if (!username.equals(getUsername()) || !password.equals(getPassword())) {
            throw new Exception("Editor login failed: Incorrect credentials.");
        }
        System.out.println("Editor " + getUsername() + " logged in successfully!");
    }
}
