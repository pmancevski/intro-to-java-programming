public class Exercise05_07 {
    public static void main(String[] args) {
        int tuition = 10000;
        double increasePercentage = 0.05;

        for (int year = 1; year <= 10; year++){
            tuition += tuition * increasePercentage;
            System.out.println("Tuition costs: " + year + " year is $" + tuition);
        }

        for (int count = 0; count < 4; count++){
            tuition += tuition * increasePercentage;
        }

        System.out.println("Total cost of 4 yeas tuition after 10 years is $" + tuition);
    }
}
