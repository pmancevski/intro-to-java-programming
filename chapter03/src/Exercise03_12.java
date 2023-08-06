import java.util.Scanner;

public class Exercise03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int temp = number;

        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;

        if (number == digit3){
            System.out.println(temp + " is palindrome");
        }
        else {
            System.out.println(temp + " is not a palindrome");
        }
    }
}
