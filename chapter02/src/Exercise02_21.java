import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberYears = input.nextInt();

        double futureInvestmentValue =
                investmentAmount * Math.pow((1 + (annualInterestRate / 1200)), (numberYears * 12));

        System.out.println("Future value is $" + futureInvestmentValue);
    }
}
