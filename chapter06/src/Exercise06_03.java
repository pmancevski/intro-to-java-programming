import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int number = input.nextInt();

        System.out.println(number + ((isPalindrome(number) ? " is " : " is not ") + "palindrome"));
    }

    public static int reverse(int number){
        String reverseNumberString = "";

        for (int count = String.valueOf(number).length(); count > 0; count--){
            reverseNumberString += number % 10;
            number /= 10;
        }

        return Integer.parseInt(reverseNumberString);
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
}
