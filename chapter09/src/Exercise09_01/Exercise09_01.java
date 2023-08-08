package Exercise09_01;

public class Exercise09_01 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 40);
        Rectangle rectangle1 = new Rectangle(3.5, 35.9);

        System.out.printf("Circle1: %nWeight: %.2f; Height: %.2f%nArea: %.2f%nPerimeter: %.2f%n%n",
                rectangle.getWidth(), rectangle.getHeight(), rectangle.getArea(), rectangle.getPerimeter());
        System.out.printf("Circle2: %nWeight: %.2f; Height: %.2f%nArea: %.2f%nPerimeter: %.2f",
                rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.getArea(), rectangle1.getPerimeter());
    }
}
