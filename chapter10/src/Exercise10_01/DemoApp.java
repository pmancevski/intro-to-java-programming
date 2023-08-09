package Exercise10_01;

public class DemoApp {
    public static void main(String[] args) {
        Time time = new Time();
        Time time1 = new Time(555550000);
        Time time2 = new Time(5, 23, 55);

        System.out.printf("First Time object: %d:%d:%d%n%n", time.getHour(), time.getMinute(), time.getSecond());
        System.out.printf("Second Time object: %d:%d:%d%n%n", time1.getHour(), time1.getMinute(), time1.getSecond());
        System.out.printf("Third Time object: %d:%d:%d%n%n", time2.getHour(), time2.getMinute(), time2.getSecond());
    }
}
