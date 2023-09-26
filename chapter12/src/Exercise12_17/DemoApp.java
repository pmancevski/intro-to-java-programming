package Exercise12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        File file = new File("hangman.txt");
        List<String> words = new ArrayList<>();

        try {
            if (!file.exists()){
                file.createNewFile();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                words.add(input.next());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Collections.shuffle(words);


    }
}
