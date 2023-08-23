package Exercise12_05;

import Exercise12_05.exceptions.IllegalTriangleException;
import Exercise12_05.model.Triangle;

public class DemoApp {
    public static void main(String[] args) {

        try {
            Triangle triangle = new Triangle(1, 4, 1);
        }
        catch (IllegalTriangleException e) {
            throw new RuntimeException(e);
        }
    }
}
