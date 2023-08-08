package Exercise09_07;

public class Exercise09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.printf("Balance: %.2f; Monthly interest: %.2f%nDate created: %s", account.getBalance(),
                account.getMonthlyInterest(), account.getDateCreated());
    }
}
