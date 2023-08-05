import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        int monthlySavingAmount = input.nextInt();

        double interestRate = 1 + (5.0 / 100 / 12);

        double firstMonth = monthlySavingAmount * interestRate;
        double secondMonth = (monthlySavingAmount + firstMonth) * interestRate;
        double thirdMonth = (monthlySavingAmount + secondMonth) * interestRate;
        double forthMonth = (monthlySavingAmount + thirdMonth) * interestRate;
        double fifthMonth = (monthlySavingAmount + forthMonth) * interestRate;
        double sixthMonth = (monthlySavingAmount + fifthMonth) * interestRate;

        System.out.println("After the sixth month, the account value is $" + sixthMonth);
    }
}
