package Exercise10_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow((myPoint.getX() - getX()), 2) + Math.pow((myPoint.getY() - getY()), 2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow((x - getX()), 2) + Math.pow((y - getY()), 2));
    }

    public static double distance(MyPoint myPoint, MyPoint myPoint1){
        return Math.sqrt(Math.pow((myPoint1.getX() - myPoint.getX()), 2) +
                Math.pow((myPoint1.getX() - myPoint.getY()), 2));
    }
}
