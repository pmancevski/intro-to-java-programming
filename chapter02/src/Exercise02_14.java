import java.util.Scanner;

public class Exercise02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double kilograms = input.nextDouble() * 0.45359237;

        System.out.print("Enter height in inches: ");
        double meters = input.nextDouble() * 0.0254;

        System.out.println("BMI is " + (kilograms / Math.pow(meters, 2)));
    }
}
