package Exercise09_06;

import java.util.Random;

public class Exercise09_06 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random();
        int[] array = new int[1000000];

        for (int count = 0; count < array.length; count++) {
            array[count] = random.nextInt();
        }

        stopWatch.start();
        sort(array);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());
    }

    public static void sort(int[] array) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void display(int[] array){
        for (int count = 0; count < array.length; count++){
            System.out.print(array[count] + " ");
        }
    }
}
