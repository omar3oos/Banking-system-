import java.util.ArrayList;

public class Bank {
    private ArrayList<User> users;
    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;

    public Bank() {
        users = new ArrayList<>();
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Create a new user (Customer, Employee, or Admin)
    public void createUser(User user) {
        users.add(user);
    }

    public User findUser(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void createAccount(Account account) {
        accounts.add(account);
        if (account.owner != null) {
            account.owner.getAccounts().add(account);
        }
    }

    public void processTransaction(Transaction transaction) {
        transactions.add(transaction);
        if (transaction.getTransactionDetails().contains("withdraw")) {
            transaction.sourceAccount.withdraw(transaction.amount);
        } else if (transaction.getTransactionDetails().contains("deposit")) {
            transaction.sourceAccount.deposit(transaction.amount);
        } else if (transaction.getTransactionDetails().contains("transfer")) {
            transaction.sourceAccount.withdraw(transaction.amount);
            transaction.destinationAccount.deposit(transaction.amount);
        }

        transaction.sourceAccount.addTransaction(transaction);
        if (transaction.destinationAccount != null) {
            transaction.destinationAccount.addTransaction(transaction);
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
