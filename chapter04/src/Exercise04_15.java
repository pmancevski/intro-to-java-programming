import java.util.Scanner;

public class Exercise04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter:");
        String character = input.next();

        if (character.length() > 1 || !Character.isLetter(character.charAt(0))){
            System.out.println("Invalid input");
            System.exit(-1);
        }

        char ch = character.toUpperCase().charAt(0);
        String output = "The corresponding number is ";

        switch (ch){
            case 65, 66, 67:
                output += 2;
                break;
            case 68, 69, 70:
                output += 3;
                break;
            case 71, 72, 73:
                output += 4;
                break;
            case 74, 75, 76:
                output += 5;
                break;
            case 77, 78, 79:
                output += 6;
                break;
            case 80, 81, 82, 83:
                output += 7;
                break;
            case 84, 85, 86:
                output += 8;
                break;
            case 87, 88, 89, 90:
                output += 9;
                break;
        }

        System.out.println(output);
    }
}
