import java.util.Random;
import java.util.Scanner;

public class Exercise03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int coin = random.nextInt(2);
        System.err.println(coin);

        System.out.print("Enter a guess 0-head or 1-tail: ");
        int guess = input.nextInt();

        if (guess > 1 || guess < 0){
            System.out.println("Wrong choice");
            System.exit(-1);
        }

        if (guess == coin){
            System.out.println("You are correct");
        }
        else {
            System.out.println("You are wrong. Please try again");
        }
    }
}
