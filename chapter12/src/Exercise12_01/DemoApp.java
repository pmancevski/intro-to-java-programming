package Exercise12_01;

public class DemoApp {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        int result = 0;
        int num = 0;
        int num1 = 0;

        try {
            num = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException exception){
            System.out.println("Wrong input: " + args[0]);
            System.exit(-1);
        }

        try {
            num1 = Integer.parseInt(args[2]);
        }
        catch (NumberFormatException exception){
            System.out.println("Wrong input: " + args[2]);
            System.exit(-1);
        }

        switch (args[1].charAt(0)) {
            case '+': result = num + num1;
            break;
            case '-': result = num - num1;
            break;
            case '*': result = num * num1;
                break;
            case '/': result = num / num1;
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
