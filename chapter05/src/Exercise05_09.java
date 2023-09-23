import java.util.Scanner;

public class Exercise05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String maxStudentName = "";
        double maxScore = 0;

        String maxSecondStudentName = "";
        double maxSecondScore = 0;

        for (int count = 0; count < numberOfStudents; count++){
            System.out.print("Enter the name and score of the students: ");
            String studentName = input.next();
            double score = input.nextDouble();

            if (score > maxScore){
                maxSecondStudentName = maxStudentName;
                maxSecondScore = maxSecondScore;

                maxStudentName = studentName;
                maxScore = score;
            }
            else if (score > maxSecondScore){
                maxSecondScore = score;
                maxSecondStudentName = studentName;
            }
        }

        System.out.println("Student with highest score: "
                + maxStudentName + " has highest score. Score: " + maxScore);
        System.out.println("Student with highest score: "
                + maxSecondStudentName + " has highest score. Score: " + maxSecondScore);
    }
}
