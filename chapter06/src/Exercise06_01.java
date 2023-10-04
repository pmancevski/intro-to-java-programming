public class Exercise06_01 {
    public static void main(String[] args) {

        for (int count = 1; count <= 100; count++){
            if (count % 10 != 0) {
                System.out.printf("%7d ", getPentagonalNumber(count));
            }
            else {
                System.out.printf("%7d%n", getPentagonalNumber(count));
            }
        }
    }

    public static int getPentagonalNumber(int n){
        return n * (3 * n - 1) / 2;
    }
}
