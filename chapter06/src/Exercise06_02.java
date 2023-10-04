import java.util.Scanner;

public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        System.out.println("Sum of all digits is: " + sumDigits(input.nextInt()));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        long number = n;

        for (int count = 0; count < String.valueOf(n).length(); count++){
            int digit = (int)number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
