import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        int subtotal = input.nextInt();
        int gratuity = input.nextInt();

        System.out.println("The gratuity is $" + (subtotal * (gratuity / 100.0)) + " and total is $" +
                (subtotal + (subtotal * (gratuity / 100.0))));
    }
}
