import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = input.next();

        if (grade.length() != 1){
            System.out.println(grade + " is an invalid grade");
            System.exit(-1);
        }

        char ch = Character.toUpperCase(grade.charAt(0));

        if (ch >= 65 && ch <= 70 && ch != 'E'){
            System.out.print("The numeric value for grade " + ch + " is ");

            switch(ch) {
                case 'A': System.out.println(4); break;
                case 'B': System.out.println(3); break;
                case 'C': System.out.println(2); break;
                case 'D': System.out.println(1); break;
                case 'F': System.out.println(0);
            }
        }
        else {
            System.out.println(ch + " is an invalid grade");
        }
    }
}
