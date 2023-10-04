import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        System.out.println("Number in reverse order: " + reverse(input.nextInt()));
    }

    public static int reverse(int number){
        String reverseNumberString = "";

        for (int count = String.valueOf(number).length(); count > 0; count--){
            reverseNumberString += number % 10;
            number /= 10;
        }

        return Integer.parseInt(reverseNumberString);
    }
}
