public class Exercise05_05 {
    public static void main(String[] args) {
        System.out.println("Kilograms     Pounds  |  Pounds     Kilograms");

        int countPounds = 20;
        for (int count = 1; count <= 199; count += 2){
            System.out.printf("%4d%15.1f%4s%6d%15.2f%n", count, (count * 2.2), "|",
                    countPounds, (countPounds / 2.2));

            countPounds += 5;
        }
    }
}
