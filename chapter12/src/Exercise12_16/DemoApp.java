package Exercise12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (!targetFile.exists()){
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        String content = "";

        try (Scanner input = new Scanner(sourceFile)){
            while (input.hasNextLine()) {
                content += input.nextLine();
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        content = content.replaceAll(args[2], args[3]);

        try (PrintWriter output = new PrintWriter(sourceFile)){
            output.print(content);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}