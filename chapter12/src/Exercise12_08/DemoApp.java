package Exercise12_08;

import Exercise12_08.exceptions.HexFormatException;

import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (HexFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);

            if (Character.isDigit(hexChar) || (hexChar >= 'A' && hexChar <= 'F')){
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
            else {
                throw new HexFormatException(hex);
            }
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {

        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
