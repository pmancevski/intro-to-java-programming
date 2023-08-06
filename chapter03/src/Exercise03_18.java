import java.util.Scanner;

public class Exercise03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter weight of the package (pounds): ");
        double weight = input.nextDouble();
        double dollars = 0;

        if (weight <= 0){
            System.out.println("Invalid input!!");
            System.exit(-1);
        }

        if (weight > 20){
            System.out.println("The package cannot be shipped");
            System.exit(-2);
        }

        if (20 >= weight && weight > 10){
            dollars = 10.5;
        }
        else if (10 >= weight && weight > 3){
            dollars = 8.5;
        }
        else if (3 >= weight && weight > 1){
            dollars = 5.5;
        }
        else if (1 >= weight && weight > 0) {
            dollars = 3.5;
        }

        System.out.println("Your shipping cost is: $" + dollars);
    }
}
