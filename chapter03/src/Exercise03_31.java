import java.util.Scanner;

public class Exercise03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();

        if (choice == 0){
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();
            System.out.println("$" + dollarAmount + " is " + (dollarAmount * rate) + " yuan");
        }
        else if (choice == 1) {
            System.out.print("Enter the yuan amount: ");
            double yuanAmount = input.nextDouble();
            System.out.println(yuanAmount + " yuan is $" + (yuanAmount / rate));
        }
        else {
            System.out.println("Incorrect input");
        }
    }
}
