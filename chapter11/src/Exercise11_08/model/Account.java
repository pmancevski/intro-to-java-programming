package Exercise11_08.model;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate();
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double amount){
        setBalance(getBalance() - amount);
        transactions.add(new Transaction('W', amount, getBalance(), "Withdrawing"));
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
        transactions.add(new Transaction('D', amount, getBalance(), "Depositing"));
    }

    @Override
    public String toString() {
        return String.format("Summary:%nName: %s; Interest rate: %.2f%nBalance: %.2f%nTransactions:%n%s",
                getName(), getAnnualInterestRate(), getBalance(), getTransactions());
    }
}
