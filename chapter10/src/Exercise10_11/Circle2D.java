package Exercise10_11;

public class Circle2D {
    private double x;
    private double y;

    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));

        return radius > distance;
    }

    public boolean contains(Circle2D circle2D){
        double distance = Math.sqrt(Math.pow((circle2D.getX() - this.x), 2)
                + Math.pow((circle2D.getY() - this.y), 2));

        return radius > distance + circle2D.radius;
    }

    public boolean overlaps(Circle2D circle2D){
        double distance = Math.sqrt(Math.pow((circle2D.getX() - this.x), 2)
                + Math.pow((circle2D.getY() - this.y), 2));

        return distance / 2 < circle2D.radius;
    }
}
