import java.util.Scanner;

public class Exercise04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string for processing: ");
        String string = input.next();

        System.out.print("String length: " + string.length() + "; First letter: " + string.charAt(0));
    }
}
