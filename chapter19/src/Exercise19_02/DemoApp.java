package Exercise19_02;

import java.util.Collections;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stringGenericStack = new GenericStack<>();

        // Bitola Skopje Ohrid Prilep Resen
        System.out.println("Please enter 5 strings separated with white space: ");
        for (int count = 0; count < 5; count++){
            stringGenericStack.push(input.next());
        }

        Collections.sort(stringGenericStack);
        Collections.reverse(stringGenericStack);
        System.out.println(stringGenericStack.toString());
    }
}
