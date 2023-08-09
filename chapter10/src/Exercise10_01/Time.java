package Exercise10_01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        Date date = new Date();
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    public Time(long elapsedTime){
        Date date = new Date(elapsedTime);
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime){
        Date date = new Date(elapsedTime);
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }
}
