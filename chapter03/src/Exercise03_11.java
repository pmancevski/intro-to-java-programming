import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        String outputString = "";

        switch (month){
            case 1:
                outputString = "January " + year + " has 31 days";
                break;
            case 2: outputString = "February " + year + (isLeapYear ? " has 29 days" : " has 28 days"); break;
            case 3: outputString = "March " + year + " has 31 days"; break;
            case 4: outputString = "April " + year + " has 30 days"; break;
            case 5: outputString = "May " + year + " has 31 days"; break;
            case 6: outputString = "June " + year + " has 30 days"; break;
            case 7: outputString = "July " + year + " has 31 days"; break;
            case 8: outputString = "August " + year + " has 31 days"; break;
            case 9: outputString = "September " + year + " has 30 days"; break;
            case 10: outputString = "October " + year + " has 31 days"; break;
            case 11: outputString = "November " + year + " has 30 days"; break;
            case 12: outputString = "December " + year + " has 31 days"; break;
        }

        System.out.println(outputString);
    }
}
