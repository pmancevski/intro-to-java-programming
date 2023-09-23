public class Exercise05_12 {
    public static void main(String[] args) {
        int count = 1;

        while (true){

            if (Math.pow(count, 2) > 12000){
                break;
            }

            count++;
        }

        System.out.println("Smallest number but number^2 bigger than 12000 is " + count);
    }
}
