package Exercise12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        File file = new File("Exercise12_15.txt");

        try {
            if (!file.exists()){
                file.createNewFile();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter output = new PrintWriter(file)){
            for (int count = 0; count < 100; count++){
                output.print(random.nextInt(1000));
                output.print(" ");
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Scanner input = new Scanner(file)){
            String[] strings = input.nextLine().split(" ");
            List<Integer> list = new ArrayList<>();

            for (int count = 0; count < strings.length; count++){
                list.add(Integer.parseInt(strings[count]));
            }

            Collections.sort(list);

            for (int count = 0; count < list.size(); count++){
                System.out.print(list.get(count) + " ");

                if ((count + 1) % 10 == 0){
                    System.out.println();
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
