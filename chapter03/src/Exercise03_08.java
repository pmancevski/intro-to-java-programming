import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.print("Non-decreasing order: ");

        if (num1 > num2 && num1 > num3){
            System.out.println((num2 > num3 ? ("" + num3 + ", " + num2 + ", " + num1):
                    ("" + num2 + ", " + num3 + ", " + num1)));
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println((num1 > num3 ? ("" + num3 + ", " + num1 + ", " + num2):
                    ("" + num1 + ", " + num3 + ", " + num2)));
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println((num1 > num2 ? ("" + num2 + ", " + num1 + ", " + num3):
                    ("" + num1 + ", " + num2 + ", " + num3)));
        }
    }
}
