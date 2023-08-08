package Exercise09_08;

public class Exercise09_08 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan();

        fan.setSpeed(Fan.FAST);
        fan.setRadius(10);
        fan.setColor("Yellow");
        fan.setOn(true);

        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);

        System.out.println(fan);
        System.out.println(fan1);
    }
}
