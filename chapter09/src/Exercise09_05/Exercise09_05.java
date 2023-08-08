package Exercise09_05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise09_05 {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println(gregorianCalendar.get(Calendar.YEAR) + "/" + gregorianCalendar.get(Calendar.MONTH) +
                "/" + gregorianCalendar.get(Calendar.DAY_OF_MONTH));

        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println(gregorianCalendar.get(Calendar.YEAR) + "/" + gregorianCalendar.get(Calendar.MONTH) +
                "/" + gregorianCalendar.get(Calendar.DAY_OF_MONTH));
    }
}
