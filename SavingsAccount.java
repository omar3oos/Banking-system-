public class SavingsAccount extends Account {
    private double interestRate;
    private double minimumBalance;
    private int withdrawalLimit;
    private int withdrawalsThisMonth;

    public SavingsAccount(String accountNumber, Customer owner, double interestRate, double minimumBalance, int withdrawalLimit) {
        super(accountNumber, owner);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalsThisMonth = 0;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawalsThisMonth >= withdrawalLimit) {
            System.out.println("Withdrawal limit reached.");
        } else if (balance - amount < minimumBalance) {
            System.out.println("Cannot go below minimum balance.");
        } else if (amount > 0 && balance >= amount) {
            balance -= amount;
            withdrawalsThisMonth++;
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public void applyMonthlyInterest() {
        calculateInterest();
        withdrawalsThisMonth = 0; // reset monthly limit
    }
}
