package Exercise12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countLine = 0;
        int countWords = 0;
        int countCharacters = 0;

        System.out.print("Please enter file name: ");
        String fileName = input.nextLine();

        File file = new File(fileName);

        try (Scanner inputFromFile = new Scanner(file)){
            while (inputFromFile.hasNextLine()){
                String line = inputFromFile.nextLine();
                countLine++;

                String[] strings = line.split(" ");
                countWords += strings.length;

                for (int count = 0; count < strings.length; count++){
                    countCharacters += strings[count].length();
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("File %s has %n%d character(s)%n%d word(s)%n%d line(s)%n",
                fileName, countCharacters, countWords, countLine);
    }
}
