package Exercise12_09.excepetions;

public class BinaryFormatException extends Exception{
    private String binString;

    public BinaryFormatException(String binString){
        super("Not a binary number (" + binString + ")");
        this.binString = binString;
    }

    public String getBinString() {
        return binString;
    }
}
