import java.util.Scanner;

public class Exercise04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        if (code < 0 || code > 127){
            System.out.println("Wrong input!! Please enter between 0 ~ 127");
            System.exit(-1);
        }

        System.out.println("The character for ASCII code " + code + " is " + (char)code);
    }
}
