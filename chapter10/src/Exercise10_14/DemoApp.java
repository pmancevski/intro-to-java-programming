package Exercise10_14;

public class DemoApp {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        MyDate myDate1 = new MyDate(561555550000L);

        System.out.println("myDate: " + myDate.getYear() + "/" + myDate.getMonth() + "/" + myDate.getDay());
        System.out.println("myDate: " + myDate1.getYear() + "/" + myDate1.getMonth() + "/" + myDate1.getDay());

    }
}
