import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int digit3 = num % 10;
        num /= 10;
        int digit2 = num % 10;
        num /= 10;

        System.out.println("The sum of the digits is " + (digit3 + digit2 + num));
    }
}
