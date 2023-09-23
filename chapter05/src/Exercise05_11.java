public class Exercise05_11 {
    public static void main(String[] args) {
        int countNewLine = 0;

        for (int count = 100; count <= 200; count++){

            if (count % 5 == 0 || count % 6 == 0){
                System.out.print(count + " ");
                countNewLine++;

                if (countNewLine % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
