package Exercise09_10;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        QuadraticEquation quadraticEquation =
                new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and "
                    + quadraticEquation.getRoot2());
        }
        else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
