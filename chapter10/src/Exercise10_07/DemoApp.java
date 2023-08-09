package Exercise10_07;

import java.util.Scanner;

public class DemoApp {
    static Account[] accounts = new Account[10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < 10; count++){
            accounts[count] = new Account(count, 100);
        }

        while (true){
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            int choice = -1;

            if (isValidId(id)) {
                do {
                    Account account = getAccount(id);
                    System.out.println(displayMenu());
                    System.out.print("Enter a choice: ");
                    choice = input.nextInt();

                    if (choice == 1){
                        System.out.println("The balance is $" + account.getBalance());
                    }
                    else if (choice == 2){
                        System.out.print("Enter an amount to withdraw: ");
                        account.withdraw(input.nextDouble());
                    }
                    else if (choice == 3){
                        System.out.print("Enter an amount to deposit: ");
                        account.deposit(input.nextDouble());
                    }
                }
                while (choice != 4);
            }
            else {
                System.out.println("Please enter valid ID!");
            }
        }
    }

    private static String displayMenu(){
        return String.format("%nMain Menu:%n\t1. Check Balance%n\t2. Withdraw%n\t3. Deposit%n\t4. Exit%n");
    }

    private static Account getAccount(int id){
        for (Account account : accounts){
            if (isValidId(account.getId())){
                return account;
            }
        }

        return null;
    }

    private static boolean isValidId(int id){
        for (Account account : accounts){
            if (account.getId() == id){
                return true;
            }
        }

        return false;
    }
}
