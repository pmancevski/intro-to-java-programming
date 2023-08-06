import java.util.Scanner;

public class Exercise03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);
        System.err.println("The lottery number is " + lottery);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int guessDigit3 = guess % 10;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit1 = ((guess / 10) / 10) % 10;

        int lotteryDigit3 = lottery % 10;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit1 = ((lottery / 10) / 10) % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery){
            System.out.println("Exact match: you win $10,000");
        }
        //not solved
    }
}
