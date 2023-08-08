package Exercise09_03;

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        Date date = new Date();

        for (long count = 10000; count <= 100000000000L; count *= 10){
            date.setTime(count);
            System.out.println(date);
        }
    }
}
