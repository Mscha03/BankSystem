package Account;

import java.util.Date;

public class BusinessAccount extends BankAccount implements Loanable{
    public BusinessAccount(int accountNumber, String ownerName, int balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void getLoan(int amount) {
        date = new Date();
    }

    @Override
    public void rePayLoan() {

    }
}
