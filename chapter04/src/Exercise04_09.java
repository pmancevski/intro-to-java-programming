import java.util.Scanner;

public class Exercise04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = input.next();

        if (ch.length() > 1){
            System.out.println("Wrong input!");
            System.exit(-1);
        }

        char character = ch.charAt(0);

        System.out.println("The Unicode for the character " + character + " is " + (int)character);
    }
}
