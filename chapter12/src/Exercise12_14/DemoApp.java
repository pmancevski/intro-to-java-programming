package Exercise12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//54, 12, 45, 89, 71, 66, 37, 74, 40, 99, 55, 23
public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.print("Enter file name: ");
        String fileName = input.next();

        File file = new File(fileName);

        try (Scanner inputFromFile = new Scanner(file)){
            while (inputFromFile.hasNext()){
                String[] strings = inputFromFile.nextLine().split(" ");

                count = strings.length;

                for (int countScore = 0; countScore < strings.length; countScore++) {
                    sum += Integer.parseInt(strings[countScore]);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sum of all scores is: " + sum);
        System.out.println("Average is: " + ((0.0 + sum) / count));
    }
}
