import java.util.Random;
import java.util.Scanner;

public class Exercise03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int computer = random.nextInt(3);
        System.err.println(computer);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userChoice = input.nextInt();

        if (userChoice > 2 || userChoice < 0){
            System.out.println("Wrong choice. Please select between 0 ~ 2.");
            System.exit(-1);
        }

        switch (computer){
            case 0:
                if (userChoice == 0){
                    System.out.println("The computer is scissor. You are scissor too. It is a draw");
                }
                else if (userChoice == 1){
                    System.out.println("The computer is scissor. You are rock. You won!");
                }
                else {
                    System.out.println("The computer is scissor. You are paper. You lost!");
                }
                break;
            case 1:
                if (userChoice == 0){
                    System.out.println("The computer is rock. You are scissor. You lost!");
                }
                else if (userChoice == 1){
                    System.out.println("The computer is rock. You are rock too. It is a draw");
                }
                else {
                    System.out.println("The computer is rock. You are paper. You won");
                }
                break;
            case 2:
                if (userChoice == 0){
                    System.out.println("The computer is paper. You are scissor. You won!");
                }
                else if (userChoice == 1){
                    System.out.println("The computer is paper. You are rock. You lost!");
                }
                else {
                    System.out.println("he computer is paper. You are paper too. It is a draw");
                }
                break;
        }
    }
}
