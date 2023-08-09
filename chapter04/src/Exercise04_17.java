import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year:");
        int year = input.nextInt();

        System.out.print("Enter a month (first three letters):");
        String monthString = input.next();

        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.print(monthString + " " + year + " has ");

        if ( monthString.equals("Jan") || monthString.equals("Mar") ||
                monthString.equals("May") || monthString.equals("Jul") ||
                monthString.equals("Aug") || monthString.equals("Oct") ||
                monthString.equals("Dec"))
            System.out.println(31 + " days");
        else if (monthString.equals("Apr") || monthString.equals("Jun") ||
                monthString.equals("Sep") || monthString.equals("Nov"))
            System.out.println(30 + " days");
        else
            System.out.println(((leapYear) ? 29 : 28) + " days");
    }
}
