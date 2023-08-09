package Exercise10_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] returnedArray = new String[numberOfStudents];
        System.arraycopy(students, 0, returnedArray, 0, numberOfStudents);
        return returnedArray;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student){
        if (numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        String[] temp = new String[students.length];
        int tempCount = 0;

        for (int count = 0; count < temp.length; count++){
           if (students[count] != null){
               if (!students[count].equals(student)){
                   temp[tempCount] = students[count];
                   tempCount++;
               }
               else {
                   numberOfStudents--;
               }
           }
        }

        students = temp;
    }

    public void clear(){
        students = new String[100];
        numberOfStudents = 0;
    }
}
