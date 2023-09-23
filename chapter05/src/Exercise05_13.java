public class Exercise05_13 {
    public static void main(String[] args) {
        int count = 12000;

        while (true){

            if (Math.pow(count, 3) < 12000){
                break;
            }

            count--;
        }

        System.out.println("Largest number but number^3 less than 12000 is " + count);
    }
}
