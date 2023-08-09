import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double stateTax = input.nextDouble();

        double grossPay = hourlyPay * hours;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeductions = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeductions;

        System.out.printf("Employee Name: %s%nHours worked: %.1f%nPay Rate: $%.2f%nGross Pay: $%.2f%n" +
                "Deductions:%n\tFederal Withholding (20.0%%): $%.2f%n" +
                "\tState Withholding (9.0%%): $%.2f%n\tTotal Deductions: $%.2f%nNet Pay: $%.2f%n",
                name, hours, hourlyPay, grossPay, federalWithholding, stateWithholding, totalDeductions,
                netPay);
    }
}
