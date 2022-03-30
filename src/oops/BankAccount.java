package oops;

public class BankAccount {
    int bankAccountNumber;
    int bankAccountHolderName;
    int customerId;
    float balance;
    static String bankName = "SBI";

    float getBalance() {
        return balance;
    }

    float deposit(float balance) {
        this.balance = this.balance + balance;
        return this.balance;
    }
    float withdraw(float bal){
        if(bal <= balance){
            balance = balance - bal;
        }
        return balance;
    }
}
