package Exercise12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean flag = true;

        System.out.print("Please enter two integers: ");
        do {
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();
                flag = false;

                System.out.print("Sum is " + (num1 + num2));
            }
            catch (InputMismatchException exc){
                System.out.println("Wrong input!!");
                input.nextLine();
            }
        }
        while (flag);
    }
}
