package Exercise20_04;

import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoApp {
    public static void main(String[] args) {
        Random random = new Random();
        List<Point2D> point2DList = new ArrayList<>();

        for (int count = 0; count < 100; count++){
            point2DList.add(new Point2D(random.nextInt(100), random.nextInt(100)));
        }
    }
}
