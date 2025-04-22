import java.util.ArrayList;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String status;
    protected Customer owner;
    protected ArrayList<Transaction> transactions;

    public Account(String accountNumber, Customer owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0.0;
        this.status = "Active";
        this.transactions = new ArrayList<>();
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transactions;
    }

    public String getAccountSummary() {
        return "Account Number: " + accountNumber + ", Balance: " + balance + ", Status: " + status;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
