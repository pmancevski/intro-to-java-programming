import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ints = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int count = 0; count < ints.length; count++){
            ints[count] = input.nextInt();
        }

        for (int count = ints.length - 1; count >= 0; count--){
            System.out.print(ints[count] + " ");
        }
    }
}
