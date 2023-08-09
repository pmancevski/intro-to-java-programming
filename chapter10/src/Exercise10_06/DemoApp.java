package Exercise10_06;

import Exercise10_03.MyInteger;
import Exercise10_05.StackOfIntegers;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        Scanner input = new Scanner(System.in);

        for (int count = 0; count <= 120; count++){
            if (MyInteger.isPrime(count)){
                stackOfIntegers.push(count);
            }
        }

        while (!stackOfIntegers.isEmpty()){
            System.out.print(stackOfIntegers.pop() + " ");
        }
    }
}
