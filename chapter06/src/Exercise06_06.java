public class Exercise06_06 {
    public static void main(String[] args) {
        displayPattern(6);
    }

    public static void displayPattern(int n){
        int whiteSpace = n - 1;

        for (int count = 1; count <= n; count++){

            for (int space = 1; space <= whiteSpace; space++){
                System.out.print("  ");
            }

            for (int num = count; num > 0; num--){
                System.out.print(num + " ");
            }

            System.out.println();
            whiteSpace--;
        }
    }
}
