import java.util.Scanner;

public class Exercise03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three triangle edges: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (edge1 + edge2 < edge3 || edge2 + edge3 < edge1 || edge3 + edge1 < edge2){
            System.out.println("Invalid input!");
            System.exit(-1);
        }

        System.out.println("Perimeter of triangle is: " + (edge1 + edge2 + edge3));
    }
}
