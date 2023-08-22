import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputControl;
        int countPos = 0;
        int countNeg = 0;
        int sum = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        do {
            inputControl = input.nextInt();

            if (inputControl != 0){
                if (inputControl > 0){
                    countPos++;
                }
                else {
                    countNeg++;
                }

                sum += inputControl;
            }
        }
        while (inputControl != 0);

        System.out.println("The number of positives is " + countPos);
        System.out.println("The number of negatives is " + countNeg);
        System.out.println("The total is  " + sum);
        System.out.println("The average is " + ((double)sum / (countPos + countNeg)));
    }
}
