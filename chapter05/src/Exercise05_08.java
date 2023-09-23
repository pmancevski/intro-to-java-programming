import java.util.Scanner;

public class Exercise05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String maxStudentName = "";
        double maxScore = 0;

        for (int count = 0; count < numberOfStudents; count++){
            System.out.print("Enter the name and score of the students: ");
            String studentName = input.next();
            double score = input.nextDouble();

            if (score > maxScore){
                maxStudentName = studentName;
                maxScore = score;
            }
        }

        System.out.println("Student: " + maxStudentName + " has highest score. Score: " + maxScore);
    }
}
