import java.util.Scanner;

public class Exercise03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int X = 0;
        final int Y = 0;
        final int RADIUS = 10;

        System.out.print("Enter a point with two coordinates:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double distance = Math.sqrt(Math.pow((x1 - X), 2) + Math.pow((y1 - Y), 2));

        if (distance > RADIUS){
            System.out.print("Point (" + x1 + ", " + y1 + ") is not in the circle");
        }
        else {
            System.out.print("Point (" + x1 + ", " + y1 + ") is in the circle");
        }
    }
}
