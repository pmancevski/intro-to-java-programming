package Exercise10_04;

public class DemoApp {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0, 0);
        MyPoint myPoint1 = new MyPoint(10, 30.5);

        System.out.println("Distance between two points is: " + MyPoint.distance(myPoint, myPoint1));
    }
}
