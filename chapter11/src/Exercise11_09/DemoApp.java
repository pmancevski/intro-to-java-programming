package Exercise11_09;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();

        System.out.print("Enter the array size n:");
        int matrixSize = input.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = random.nextInt(2);
            }
        }

        System.out.println("The random array is ");
        displayMatrix(matrix);
    }

    public static void displayMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
