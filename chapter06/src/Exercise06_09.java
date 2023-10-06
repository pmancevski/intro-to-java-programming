public class Exercise06_09 {
    public static void main(String[] args) {
        double meterCount = 20;

        System.out.println("Feet     Meters   |   Meters     Feet");
        for (double feetCount = 1; feetCount <= 10; feetCount++){
            System.out.printf("%4.1f%10.3f%5s%8.1f%11.3f%n", feetCount, footToMeter(feetCount), "|",
                    meterCount, meterToFoot(meterCount));
            meterCount += 5;
        }
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
