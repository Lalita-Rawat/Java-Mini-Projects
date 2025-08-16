// Abstract base class: User
public abstract class User {
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        this.username = username;
        this.password = password;
    }

    // Encapsulation: Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Abstract method
    public abstract void login(String username, String password) throws Exception;
}
