import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_35 {
    public static void main(String[] args) {
        String[] words = {"write", "that", "Bitola", "Marmalad"};
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int countMissed = 0;
        boolean play = true;

        String guessingWord = words[random.nextInt(words.length)];
        System.err.println(guessingWord);
        char[] hiddenWord = hideWord(guessingWord);

        while (play){
            while (Arrays.toString(hiddenWord).contains("*")){
                System.out.print("(Guess) Enter a letter in word " + displayHiddenWord(hiddenWord) + " > ");
                char inputLetter = input.next().charAt(0);

                if (guessingWord.contains(String.valueOf(inputLetter))){
                    for (int count = 0; count < hiddenWord.length; count++){
                        if (guessingWord.charAt(count) == inputLetter && hiddenWord[count] == '*'){
                            hiddenWord[count] = inputLetter;
                        }
                        else if (guessingWord.charAt(count) == inputLetter && hiddenWord[count] != '*'){
                            System.out.println(inputLetter + " is already in the word");
                            break;
                        }
                    }
                }
                else {
                    System.out.println(inputLetter + " is not in the word");
                    countMissed++;
                }
            }

            System.out.println("The word is " + "\"" + guessingWord + "\"" + "." +
                    " You missed " + countMissed + " time(s)");

            System.out.print("Do you want to guess another word? Enter y or n >");
            char playAgain = input.next().charAt(0);

            if (playAgain == 'y'){
                guessingWord = words[random.nextInt(words.length)];
                System.err.println(guessingWord);
                hiddenWord = hideWord(guessingWord);
            }
            else {
                play = false;
            }
        }
    }

    public static char[] hideWord(String word){
        char[] hiddenWord = new char[word.length()];

        for (int count = 0; count < word.length(); count++){
            hiddenWord[count] = '*';
        }

        return hiddenWord;
    }

    public static String displayHiddenWord(char[] chars) {
        // If needed to be replaced and whitespace then use following code:
        // return Arrays.toString(chars).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "")
        // .replaceAll(" ", "");
        return Arrays.toString(chars).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
    }
}