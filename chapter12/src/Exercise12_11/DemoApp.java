package Exercise12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    The exercise is modified to be run from IDE (Intellij) and input from console.
 */
public class DemoApp {
    public static void main(String[] args) {

//        if (args.length != 2){
//            System.out.println("Usage: java Exercise12_11 wordToBeReplaced filename");
//            System.exit(-1);
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter word to be removed: ");
        String wordToBeRemoved = input.next();

        System.out.print("Enter file name: ");
        String fileName = input.next();

        File file = new File(fileName);

        String string = "";

        try (Scanner inputFromFile = new Scanner(file)){
            while (inputFromFile.hasNextLine()){
                string += inputFromFile.nextLine().replace((wordToBeRemoved + " "), "");
                string += "\n";
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
