import java.util.Scanner;

public class Exercise03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int value = input.nextInt();

        System.out.println("Is " + value + " divisible by 5 and 6? " + ((value % 5 == 0) && (value % 6 == 0)));
        System.out.println("Is " + value + " divisible by 5 or 6? " + ((value % 5 == 0) || (value % 6 == 0)));
        System.out.println("Is " + value + " divisible by 5 or 6, but not both? " +
                ((value % 5 == 0) ^ (value % 6 == 0)));
    }
}
