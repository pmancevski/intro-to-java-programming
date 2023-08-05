import java.util.Scanner;

public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        int speed = input.nextInt();
        double acceleration = input.nextDouble();

        double runwayLength = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + runwayLength);
    }
}
