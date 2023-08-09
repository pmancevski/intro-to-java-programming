package Exercise10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return getValue() % 2 == 0;
    }

    public boolean isOdd() {
        return getValue() % 2 != 0;
    }

    public boolean isPrime() {
        int i, m = 0;
        boolean flag = true;

        m = value / 2;

        if (value == 0 || value == 1) {
            flag = false;
        }
        else {
            for (i = 2; i <= m; i++) {
                if (value % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        int i, m = 0;
        boolean flag = true;

        m = value / 2;

        if (value == 0 || value == 1) {
            flag = false;
        }
        else {
            for (i = 2; i <= m; i++) {
                if (value % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

    public static boolean isEven(MyInteger value) {
        return value.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger value) {
        return value.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger value) {
        int i, m = 0;
        boolean flag = true;

        m = value.getValue() / 2;

        if (value.getValue() == 0 || value.getValue() == 1) {
            flag = false;
        }
        else {
            for (i = 2; i <= m; i++) {
                if (value.getValue() % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger value){
        return this.value == value.getValue();
    }

    public static int parseInt(char[] chars){
        String num = "";

        for (int count = 0; count < chars.length; count++){
            num += chars[count];
        }

        return Integer.parseInt(num);
    }

    public static int parseInt(String number){
        return Integer.parseInt(number);
    }
}
