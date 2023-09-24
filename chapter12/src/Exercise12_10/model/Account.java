package Exercise12_10.model;

import java.util.Date;

public class Account {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String mobile;
    private double salary;
    private Date birthday;
    private Date dateHire;

    public Account(long id, String firstName, String lastName, String email, String telephone, String mobile,
                   double salary, Date birthday, Date dateHire) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.mobile = mobile;
        this.salary = salary;
        this.birthday = birthday;
        this.dateHire = dateHire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getDateHire() {
        return dateHire;
    }

    public void setDateHire(Date dateHire) {
        this.dateHire = dateHire;
    }
}
