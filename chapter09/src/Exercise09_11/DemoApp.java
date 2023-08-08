package Exercise09_11;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f:");
        LinearEquation linearEquation = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (linearEquation.isSolvable()){
            System.out.printf("x is %.2f and y is %.2f%n", linearEquation.getX(), linearEquation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
    }
}
