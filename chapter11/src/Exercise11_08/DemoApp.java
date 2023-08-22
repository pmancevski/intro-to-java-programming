package Exercise11_08;

import Exercise11_08.model.Account;

public class DemoApp {
    public static void main(String[] args) {
        Account account = new Account(1122, "George", 1000);
        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account);
    }
}
