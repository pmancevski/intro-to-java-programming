public class Exercise05_03 {
    public static void main(String[] args) {

        System.out.println("Kilograms      Pounds");

        for (int count = 1; count <=199; count+=2){
            System.out.printf("%6d%15.2f%n", count, (count * 2.2));
        }
    }
}
