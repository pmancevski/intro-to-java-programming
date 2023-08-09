import java.util.Scanner;

public class Exercise03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int X = 0;
        final int Y = 0;
        final int WIDTH = 10;
        final int HEIGHT = 5;

        System.out.print("Enter a point with two coordinates:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double horizontalDistance = Math.sqrt(Math.pow((x1 - WIDTH / 2.0), 2) + Math.pow((y1 - 0), 2));
        double verticalDistance = Math.sqrt(Math.pow((x1 - 0), 2) + Math.pow((y1 - HEIGHT / 2.0), 2));

        if ((horizontalDistance <= WIDTH) && (verticalDistance <= HEIGHT)){
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + x1 + ", " + y1 + ") is not in the rectangle");
        }
    }
}
