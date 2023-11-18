import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bestScore = 0;
        int[] scores;

        System.out.print("Enter the number of students: ");
        scores = new int[input.nextInt()];

        System.out.print("Enter "+ scores.length +" scores: ");
        for (int count = 0; count < scores.length; count++){
            scores[count] = input.nextInt();

            if (bestScore < scores[count]){
                bestScore = scores[count];
            }
        }

        for (int count = 0; count < scores.length; count++){
            System.out.print("Student " + count + " score is " + scores[count] +
                    " and grade is ");

            if (scores[count] >= bestScore - 10){
                System.out.println("A");
            }
            else if (scores[count] >= bestScore - 20){
                System.out.println("B");
            }
            else if (scores[count] >= bestScore - 30){
                System.out.println("C");
            }
            else if (scores[count] >= bestScore - 40){
                System.out.println("D");
            }
            else {
                System.out.println("F");
            }
        }
    }
}
