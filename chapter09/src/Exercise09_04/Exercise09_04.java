package Exercise09_04;

import java.util.Random;

public class Exercise09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int count = 1; count <= 50; count++){
            if (count % 10 != 0) {
                System.out.print(random.nextInt(100) + " ");
            }
            else {
                System.out.println(random.nextInt(100));
            }
        }
    }
}
