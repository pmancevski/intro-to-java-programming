import java.util.Scanner;

public class Exercise03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012):");
        int year = input.nextInt() - 1;

        System.out.print("Enter month: 1−12:");
        int month = input.nextInt();

        System.out.print("Enter the day of the month: 1−31:");
        int day = input.nextInt();

        if (day == 1){
            day = 13;
        }
        else if (day == 2){
            day = 14;
        }

        int k = year % 100;
        int j = year / 100;

        //int dayOfWeek = (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) %7;
        int dayOfWeek = (day + (26 * (month + 1)) / 10 + (year % 100)
                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        System.out.println(dayOfWeek);
    }
}
