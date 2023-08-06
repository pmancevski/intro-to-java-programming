import java.util.Random;

public class Exercise03_16 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 1 + random.nextInt(200) - 100;
        int y = 1 + random.nextInt(100) - 50;

        System.out.println("Random rectangle coordinate with center (0, 0) is (" + x + ", " + y + ")");
    }
}
