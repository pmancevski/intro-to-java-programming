public class Exercise05_04 {
    public static void main(String[] args) {
        System.out.println("Miles        Kilometers");

        for (int count = 1; count <= 10; count++){
            System.out.printf("%3d%18.3f%n", count, (count * 1.609));
        }
    }
}
