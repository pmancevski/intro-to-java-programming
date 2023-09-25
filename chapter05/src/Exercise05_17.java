import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int rows = 1; rows <= numberOfLines; rows++) {

            for (int whiteSpace = numberOfLines - rows; whiteSpace >= 1; whiteSpace--) {
                System.out.print("  ");
            }

            for (int left = rows; left >= 2; left--) {
                System.out.print(left + " ");
            }


            for (int right = 1; right <= rows; right++) {
                System.out.print(right + " ");
            }

            System.out.println();
        }
    }
}
