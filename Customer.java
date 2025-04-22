import java.util.ArrayList;

public class Customer extends User {
    private String address;
    private ArrayList<Account> accounts;

    public Customer(String userId, String username, String password, String name, String email, String address) {
        super(userId, username, password, name, email);
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void viewAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc.getAccountSummary());
        }
    }

    public void makeTransaction(Transaction transaction) {
        // To be implemented: process transaction
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println(name + " has logged out.");
    }

    @Override
    public void updateProfile(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
