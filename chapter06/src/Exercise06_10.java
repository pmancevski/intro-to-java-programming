public class Exercise06_10 {
    public static void main(String[] args) {
        int newLine = 1;
        for (int count = 10000; count > 0; count--){
            if (isPrime(count)){
                System.out.print(count + " ");

                if (newLine % 10 == 0){
                    System.out.println();
                }

                newLine++;
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
