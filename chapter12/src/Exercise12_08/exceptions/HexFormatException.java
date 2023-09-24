package Exercise12_08.exceptions;

public class HexFormatException extends Exception {
    private String hexString;

    public HexFormatException(String hexString){
        super("Not a hex number (" + hexString + ")");
        this.hexString = hexString;
    }

    public String getHexString() {
        return hexString;
    }
}
