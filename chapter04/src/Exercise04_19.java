import java.util.Scanner;

public class Exercise04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String num = input.next();

        if (num.length() > 9){
            System.out.println("Invalid input");
            System.exit(-1);
        }

        int digit9 = Character.getNumericValue(num.charAt(8));
        int digit8 = Character.getNumericValue(num.charAt(7));
        int digit7 = Character.getNumericValue(num.charAt(6));
        int digit6 = Character.getNumericValue(num.charAt(5));
        int digit5 = Character.getNumericValue(num.charAt(4));
        int digit4 = Character.getNumericValue(num.charAt(3));
        int digit3 = Character.getNumericValue(num.charAt(2));
        int digit2 = Character.getNumericValue(num.charAt(1));
        int digit1 = Character.getNumericValue(num.charAt(0));

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
