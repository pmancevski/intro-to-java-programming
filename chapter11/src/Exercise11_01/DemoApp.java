package Exercise11_01;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 3 sides, color and is filled (true or false) for particular triangle: ");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble(),
                input.next(), input.nextBoolean());

        System.out.println("Area: " +triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
