public class Exercise05_15 {
    public static void main(String[] args) {
        int countNewLine = 1;

        for (int count = '!'; count <= (int)'~'; count++){
            System.out.print((char) count + " ");

            if (countNewLine % 10 == 0){
                System.out.println();
            }

            countNewLine++;
        }
    }
}
