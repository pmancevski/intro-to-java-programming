import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble() / 1200;

        double monthlyInterest = balance * interestRate;

        System.out.println("The monthly interest is " + monthlyInterest);
    }
}
