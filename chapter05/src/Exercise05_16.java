import java.util.Scanner;

public class Exercise05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 2;

        while (number != 1){

            while (number % count == 0){
                System.out.print(count + " ");
                number /= count;
            }

            count++;
        }
    }
}
