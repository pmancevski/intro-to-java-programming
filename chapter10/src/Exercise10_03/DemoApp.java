package Exercise10_03;

public class DemoApp {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(73);

        System.out.println("Test isEven(): " + myInteger.isEven());
        System.out.println("Test isOdd(): " + myInteger.isOdd());
        System.out.println("Test isPrime(): " + myInteger.isPrime());

        System.out.println();
        System.out.println("Test static method isEven(value): " + MyInteger.isEven(55));
        System.out.println("Test static method isOdd(value): " + MyInteger.isOdd(55));
        System.out.println("Test static method isPrime(value): " + MyInteger.isPrime(55));

        System.out.println();
        System.out.println("Test static method isEven(MyInteger): " + MyInteger.isEven(myInteger));
        System.out.println("Test static method isOdd(MyInteger): " + MyInteger.isOdd(myInteger));
        System.out.println("Test static method isPrime(MyInteger): " + MyInteger.isPrime(myInteger));

        System.out.println();
        MyInteger myInteger1 = new MyInteger(73);
        System.out.println("Test equals(int): " + myInteger.equals(65));
        System.out.println("Test equals(MyInteger): " + myInteger.equals(myInteger1));

        char[] chars = {'5', '3', '9', '0'};
        String number = "123456";
        System.out.println();
        System.out.println("Test parseInt(char[]): " + MyInteger.parseInt(chars));
        System.out.println("Test parseInt(String): " + MyInteger.parseInt(number));
    }
}
