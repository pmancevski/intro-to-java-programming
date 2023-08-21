package Exercise11_05.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students.add(student);
    }

    public String[]  getStudents() {
        return (String[]) students.toArray();
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student){
        students.remove(student);
    }
}
