package Exercise10_05;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        String output = "The smallest factors of " + number + " are: ";

        int i = 2;
        while (number / i != 1){
            if (number % i == 0) {
                stackOfIntegers.push(i);
                number /= i;
            }
            else
                i++;
        }
        stackOfIntegers.push(number);

        while (!stackOfIntegers.isEmpty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}
