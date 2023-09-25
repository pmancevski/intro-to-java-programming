package Exercise12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.next();

        File file = new File(fileName);

        String content = "";

        try (Scanner inputFromFile = new Scanner(file)){
            while (inputFromFile.hasNextLine()){
                content += inputFromFile.nextLine();
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //content = content.replace("\n{", "{\n");

        try (PrintWriter output = new PrintWriter(fileName)){
            output.print(content);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
