import java.util.Scanner;

public class Exercise05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        int loanAmount = input.nextInt();

        System.out.print("Number of years: ");
        int years = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n", totalPayment);

        double balance = loanAmount;

        System.out.println("Payment#     Interest     Principal      Balance");

        for (int count = 1; count <= years * 12; count++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%3d%17.2f%14.2f%14.2f%n", count, interest, principal, balance);
        }
    }
}
