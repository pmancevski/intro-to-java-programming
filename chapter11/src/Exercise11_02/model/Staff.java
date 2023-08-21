package Exercise11_02.model;

import Exercise11_02.utils.MyDate;

public class Staff extends Employee{

    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary,
                 String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
