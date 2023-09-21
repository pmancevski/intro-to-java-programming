public class Exercise05_06 {
    public static void main(String[] args) {
        System.out.println("Miles     Kilometers  |  Kilometers     Miles");

        int countKilometers = 20;
        for (int count = 1; count <= 10; count++){
            System.out.printf("%4d%12.3f%7s%6d%17.3f%n", count, (count * 1.609), "|",
                    countKilometers, (countKilometers / 1.609));

            countKilometers += 5;
        }
    }
}
