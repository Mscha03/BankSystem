package Transaction;

import java.util.Date;

public class Transaction {
    int transactionId;
    String transactionType;
    int amount;
    Date transactionDate;
    String account;

    public Transaction(int transactionId, String transactionType, int amount, String account) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.account = account;
        transactionDate = new Date();
    }

    public void execute(){
        // soon...
    }

    private void rollBack(){
        // soon...
    }
}
