public abstract class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String name;
    protected String email;

    public User(String userId, String username, String password, String name, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public abstract boolean login(String username, String password);
    public abstract void logout();
    public abstract void updateProfile(String name, String email, String password);
}
