package Account;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private int balance;

    public BankAccount(int accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("واریز شد.");
        }else {
            System.out.println("مقدار وارد شده باید مثبت باشد.");
        }
    }
    public void withdraw(int amount){
        if (amount < balance){
            balance -= amount;
            System.out.println("برداشت با موفقیت انجام شد");
        }else {
            System.out.println("موجودی کافی نیست.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
