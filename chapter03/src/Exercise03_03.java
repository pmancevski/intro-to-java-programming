import java.util.Scanner;

public class Exercise03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double temp = a * d - b * c;

        if (temp == 0){
            System.out.println("The equation has no solution.");
        }
        else {
            double x = (e * d - b * f) / temp;
            double y = (a * f - e * c) / temp;
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
