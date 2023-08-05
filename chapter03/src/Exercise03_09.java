import java.util.Scanner;

public class Exercise03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();

        int digit9 = digits % 10;
        digits /= 10;
        int digit8 = digits % 10;
        digits /= 10;
        int digit7 = digits % 10;
        digits /= 10;
        int digit6 = digits % 10;
        digits /= 10;
        int digit5 = digits % 10;
        digits /= 10;
        int digit4 = digits % 10;
        digits /= 10;
        int digit3 = digits % 10;
        digits /= 10;
        int digit2 = digits % 10;
        digits /= 10;
        int digit1 = digits % 10;

        int checkSum = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7
                + digit8 * 8 + digit9 * 9) % 11;

        if (checkSum == 10){
            System.out.println("The ISBN-10 number is " + (digit1 + "" + digit2 + "" + digit3 + "" + digit4
                    + "" + digit5 + "" + digit6 + "" + digit7 + "" + digit8 + "" + digit9) + "X");
        }
        else {
            System.out.println("The ISBN-10 number is " + (digit1 + "" + digit2 + "" + digit3 + "" + digit4
                    + "" + digit5 + "" + digit6 + "" + digit7 + "" + digit8 + "" + digit9) + "" + checkSum);
        }
    }
}
