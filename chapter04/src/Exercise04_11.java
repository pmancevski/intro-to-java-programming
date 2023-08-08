import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15):");
        int num = input.nextInt();

        String output = "";

        switch (num){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                output = Integer.toString(num);
                break;
            case 10:
                output = "A";
                break;
            case 11:
                output = "B";
                break;
            case 12:
                output = "C";
                break;
            case 13:
                output = "D";
                break;
            case 14:
                output = "E";
                break;
            case 15:
                output = "F";
                break;
            default:
                System.out.println(num + " is an invalid input!");
                System.exit(-1);
        }

        System.out.println("The hex value is " + output);
    }
}
