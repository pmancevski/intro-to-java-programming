package Exercise12_07;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String bin = input.nextLine();

        System.out.println("The decimal value for hex number " +
                bin + " is " + bin2dec(bin));
    }

    public static int bin2dec(String binaryString){
        for (int count = 0; count < binaryString.length(); count++){
            char binChar = binaryString.charAt(count);

            if (!(binChar == '0' || binChar == '1')){
                throw new NumberFormatException("Not a binary number");
            }
        }

        return Integer.parseInt(binaryString, 2);
    }
}
