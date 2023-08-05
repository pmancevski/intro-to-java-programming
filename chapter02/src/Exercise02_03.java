import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        System.out.println(feet + " feet is " + (feet * 0.305) + " meters");
    }
}
