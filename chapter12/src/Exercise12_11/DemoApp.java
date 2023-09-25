package Exercise12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {

        File file = new File("test.txt");

        String string = "";

        try (Scanner input = new Scanner(file)){
            while (input.hasNextLine()){
                string = input.nextLine();
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter output = new PrintWriter(file)){
            output.println(string);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
