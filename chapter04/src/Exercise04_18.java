import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String choice = input.next();

        if (choice.length() > 2 || choice.isBlank()){
            System.out.println("Invalid input");
            System.exit(-1);
        }

        String output = "";

        switch (choice.charAt(0)){
            case 'M':
                output += "Mathematics";
                break;
            case 'C':
                output += "Computer Science";
                break;
            case 'I':
                output += "Information Technology";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(-2);
        }

        switch (Character.getNumericValue(choice.charAt(1))){
            case 1:
                output += " Freshman";
                break;
            case 2:
                output += " Sophomore";
                break;
            case 3:
                output += " Junior";
                break;
            case 4:
                output += " Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(-2);
        }

        System.out.println(output);
    }
}
