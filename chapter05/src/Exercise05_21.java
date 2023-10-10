import java.util.Scanner;

public class Exercise05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();

        System.out.print("Number of Years: ");
        int years = input.nextInt();

        System.out.println("Interest Rate     Monthly Payment      Total Payment");

        for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125){
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            System.out.printf("%7.3f%%%20.2f%22.2f%n", annualInterestRate, monthlyPayment, totalPayment);
        }
    }
}
