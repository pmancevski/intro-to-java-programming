import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter investment amount (ex: 10000): ");
        double investmentAmount = input.nextDouble();

        System.out.print("Please enter interest rate (ex: 9%): ");
        double interestRate = input.nextDouble();

        System.out.println("Years       Future Value");
        for (int count = 1; count <= 30; count++){
            System.out.printf("%2d%20.2f%n", count, futureInvestmentValue(investmentAmount, interestRate, count));
        }

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){

        return investmentAmount * Math.pow((1 + (monthlyInterestRate / 100 / 12)), (years * 12));
    }
}
