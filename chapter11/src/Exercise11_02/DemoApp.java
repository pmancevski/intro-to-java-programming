package Exercise11_02;

import Exercise11_02.model.*;

public class DemoApp {
    public static void main(String[] args) {
        Person person = new Person("Pero Manchevski", "Address num", "+38977999999",
                "pmancevskiwork@gmail.com");
        Student student = new Student("petar Manchevski", "Address num", "+38977999999",
                "pmancevskiwork@gmail.com", Student.JUNIOR);
        Employee employee = new Employee("Peckata Manchevski", "Address num", "+38977999999",
                "pmancevskiwork@gmail.com", "direktor", 25000);
        Faculty faculty = new Faculty("Fidan fidanovski", "Address num", "+38977999999",
                "pmancevskiwork@gmail.com", "Managment", 30000, 29, "Intermediate");
        Staff staff = new Staff("Fidan fidanovski", "Address num", "+38977999999",
                "pmancevskiwork@gmail.com", "Managment", 30000, "Title");


        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}