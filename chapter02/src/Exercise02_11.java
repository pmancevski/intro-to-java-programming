import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentPopulation = 312_032_486;
        double birthPerYear = (365 * 24 * 60 * 60) / 7.0;
        double deathPerYear = (365 * 24 * 60 * 60) / 13.0;
        double newImmigrantPerYear = (365 * 24 * 60 * 60) / 45.0;

        System.out.print("Enter the number of years: ");
        int year = input.nextInt();

        long projection = (long)(currentPopulation + (birthPerYear - deathPerYear + newImmigrantPerYear) * year);

        System.out.println("The population in 5 years is " + projection);
    }
}
