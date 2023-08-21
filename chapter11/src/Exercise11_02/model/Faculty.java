package Exercise11_02.model;

import Exercise11_02.utils.MyDate;

public class Faculty extends Employee{

    private double hours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary,
                   double hours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.hours = hours;
        this.rank = rank;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
