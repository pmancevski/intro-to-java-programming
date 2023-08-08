import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();

        double area = (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.print("The area of the polygon is " + area);
    }
}
