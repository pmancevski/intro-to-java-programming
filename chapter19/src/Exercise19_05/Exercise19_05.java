package Exercise19_05;

import java.util.Scanner;

public class Exercise19_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] array = new Integer[10];

        // test cases
        // t1: 15 9 8 7 6 5 4 6 7 10
        // t2: 1 2 3 4 5 6 7 8 9 10
        // t3: 4 5 6 7 8 15 3 4 5 1
        System.out.print("Please enter 10 integers: ");
        for (int count = 0; count < 10; count++){
            array[count] = input.nextInt();
        }

        System.out.println(max(array));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E object = list[0];

        for (int count = 1; count < list.length; count++){
            if (list[count].compareTo(object) == 1){
                object = list[count];
            }
        }

        return object;
    }
}
