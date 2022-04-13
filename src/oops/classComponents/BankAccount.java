package oops.classComponents;

public class BankAccount {
    int bankAccountNumber;
    String bankAccountHolderName;
    int customerId;
    float balance;
    static String bankName = "SBI";

    BankAccount() {
        this(1,"abc");
        System.out.println("Zero param constructor");
    }

    BankAccount(int bankAccountNumber, String bankAccountHolderName, int customerId, float balance) {
        this();
//        this();
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
        this.customerId = customerId;
        this.balance = balance;
    }

    public BankAccount(int bankAccountNumber, String bankAccountHolderName) {
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public BankAccount(int bankAccountNumber, String bankAccountHolderName, int customerId) {
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
        this.customerId = customerId;
    }

    public BankAccount(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    float getBalance() {
        return balance;
    }

    float deposit(float balance) {
        this.balance = this.balance + balance;
        return this.balance;
    }

    float withdraw(float bal) {
        if (bal <= balance) {
            balance = balance - bal;
        }
        return balance;
    }
}
