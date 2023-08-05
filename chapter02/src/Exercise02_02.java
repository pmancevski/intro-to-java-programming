import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        int length = input.nextInt();

        double area = Math.pow(radius, 2) * Math.PI;

        System.out.println("The Area is " + area);
        System.out.println("The Volume is " + (area * length));
    }
}
