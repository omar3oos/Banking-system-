import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private LocalDateTime timestamp;
    private String type; // "deposit", "withdraw", "transfer"
    private double amount;
    private Account sourceAccount;
    private Account destinationAccount;
    private String status; // "success", "failed", etc.

    public Transaction(String transactionId, String type, double amount, Account source, Account destination, String status) {
        this.transactionId = transactionId;
        this.timestamp = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
        this.sourceAccount = source;
        this.destinationAccount = destination;
        this.status = status;
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId + ", Type: " + type +
               ", Amount: " + amount + ", Status: " + status +
               ", Time: " + timestamp;
    }
}
