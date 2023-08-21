package Exercise10_11;

public class DemoApp {
    public static void main(String[] args) {
        Circle2D circle2D = new Circle2D(2, 2, 5.5);
        System.out.println("Area: " + circle2D.getArea());
        System.out.println("Perimeter: " + circle2D.getPerimeter());
        System.out.println("Test contains(x, y): " + circle2D.contains(3, 3));

        System.out.println("Test contains(Circle2D): " + circle2D.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Test overlaps(Circle2D): " + circle2D.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
