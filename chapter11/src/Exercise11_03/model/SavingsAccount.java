package Exercise11_03.model;

public class SavingsAccount extends Account{
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println(
                    "Savings account overdrawn, transaction rejected");
    }
}
