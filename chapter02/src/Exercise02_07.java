import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long totalMinutes = input.nextLong();

        long totalHours = totalMinutes / 60;
        long totalDays = totalHours  / 24;
        long currentDays = totalDays % 24;

        long totalYears = totalDays / 365;

        System.out.println(totalMinutes + " minutes is approximately " + totalYears + " years and "
                + currentDays + " days");
    }
}
