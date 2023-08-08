package Exercise20_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {

        if (args.length != 1){
            System.out.println("Project structure should be chapter20/src/Exercise20_01/Exercise20_02.DemoApp.java");
            System.out.println("Usage:\n");
            System.out.println("javac -cp . src/Exercise20_01/Exercise20_02.DemoApp.java");
            System.out.println("java -cp src Exercise20_01.Exercise20_02.DemoApp fileName");
            System.exit(-1);
        }

        System.out.println(args);

        List<String> stringList = new ArrayList<>();

        File file =  new File("textFile.txt");

        if (!file.exists()){
            System.out.println("File not found!");
            System.exit(-1);
        }

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()){
                String s = input.next();

                if (Character.isLetter(s.charAt(0))){
                    stringList.add(s);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(stringList);

        System.out.println(stringList.toString());
    }
}
