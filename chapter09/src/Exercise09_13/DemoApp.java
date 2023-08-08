package Exercise09_13;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array:");
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = input.nextDouble();
            }
        }

        Location location = locateLargest(array);

        System.out.printf("The location of the largest element is %.2f at (%d, %d)",
                location.getMaxValue(), location.getRow(), location.getColumn());
    }

    public static Location locateLargest(double[][] a){
        int row = 0;
        int colum = 0;
        double maxValue = 0;

        for (int countRow = 0; countRow < a.length; countRow++){
            for (int countColumn = 0; countColumn < a[row].length; countColumn++){
                if (a[countRow][countColumn] > maxValue){
                    maxValue = a[countRow][countColumn];
                    row = countRow;
                    colum = countColumn;
                }
            }
        }

        return new Location(row, colum, maxValue);
    }
}
