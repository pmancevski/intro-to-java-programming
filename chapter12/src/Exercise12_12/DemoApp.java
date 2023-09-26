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
        int countTab = 0;

        try (Scanner inputFromFile = new Scanner(file)){
            while (inputFromFile.hasNext()){
                String str = inputFromFile.next();

                if (str.contains("{")){
                    content += str + "\n" + "\t";
                    countTab++;
                }
                else if (str.contains("}")){
                    String tabString = "";

                    for (int count = 0; count < countTab - 1; count++){
                        tabString += "\t";
                    }

                    content += "\n" + tabString + str;
                    countTab--;
                }
                else {
                    content += str + " ";
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter output = new PrintWriter(fileName)){
            output.print(content);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
