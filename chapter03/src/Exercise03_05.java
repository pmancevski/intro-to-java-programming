import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today’s day: ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        String todayString = "";
        String futureDayString = "";

        int futureDay = (today + elapsedDays) % 7;

        switch (today){
            case 0:
                todayString = "Sunday";
                break;
            case 1:
                todayString = "Monday";
                break;
            case 2:
                todayString = "Tuesday";
                break;
            case 3:
                todayString = "Wednesday";
                break;
            case 4:
                todayString = "Thursday";
                break;
            case 5:
                todayString = "Friday";
                break;
            case 6:
                todayString = "Saturday";
                break;
        }

        switch (futureDay){
            case 0:
                futureDayString = "Sunday";
                break;
            case 1:
                futureDayString = "Monday";
                break;
            case 2:
                futureDayString = "Tuesday";
                break;
            case 3:
                futureDayString = "Wednesday";
                break;
            case 4:
                futureDayString = "Thursday";
                break;
            case 5:
                futureDayString = "Friday";
                break;
            case 6:
                futureDayString = "Saturday";
                break;
        }

        System.out.println("Today is " + todayString + " and the future day is " + futureDayString);
    }
}
