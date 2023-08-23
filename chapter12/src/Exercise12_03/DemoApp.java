package Exercise12_03;

import java.util.Random;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int[] ints = new int[100];

        for (int count = 0; count < ints.length; count++){
            ints[count] = random.nextInt(1000);
        }

        System.out.print("Enter the index of the array [1 - 100]: ");
        int index = input.nextInt();

        try {
            System.out.println("Element in that index is: " + ints[index - 1]);
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Out of Bounds");
        }
    }
}
