package oops.inheritance.account;

import oops.inheritance.account.saving.SavingAccount;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.accountNumber);
        System.out.println(account.accountBalance);
        System.out.println(account.accountHolderName);
        System.out.println(account.customerId);

        SavingAccount savingAccount = new SavingAccount();
        System.out.println(savingAccount.accountBalance);
        System.out.println(savingAccount.accountNumber);
        System.out.println(savingAccount.accountHolderName);
        System.out.println(savingAccount.customerId);
    }
}
