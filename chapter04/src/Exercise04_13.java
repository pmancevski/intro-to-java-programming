import java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.next();

        if (letter.length() != 1){
            System.out.println(letter + " is an invalid input");
            System.exit(-1);
        }
        else if (!Character.isAlphabetic(letter.charAt(0))){
            System.out.println(letter + " is an invalid input");
        }

        if (letter.toLowerCase().equals("a") || letter.toLowerCase().equals("e") || letter.toLowerCase().equals("i") ||
                letter.toLowerCase().equals("o") || letter.toLowerCase().equals("u")){
            System.out.println(letter + " is a vowel");
        }
        else {
            System.out.println(letter + " is a consonant");
        }
    }
}
