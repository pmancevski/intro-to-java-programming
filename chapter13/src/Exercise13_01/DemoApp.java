package Exercise13_01;

import Exercise13_01.model.Triangle;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 3 side of a triangle, what color it is and if it's filled or not: ");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble(),
                input.next(), input.nextBoolean());

        System.out.println(triangle);
    }
}
