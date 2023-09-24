package Exercise12_09;

import Exercise12_09.excepetions.BinaryFormatException;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String bin = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " +
                    bin + " is " + bin2dec(bin));
        }
        catch (BinaryFormatException e) {
            throw new RuntimeException(e);
        }

    }

    public static int bin2dec(String binaryString) throws BinaryFormatException {
        for (int count = 0; count < binaryString.length(); count++){
            char binChar = binaryString.charAt(count);

            if (!(binChar == '0' || binChar == '1')){
                throw new BinaryFormatException(binaryString);
            }
        }

        return Integer.parseInt(binaryString, 2);
    }
}
