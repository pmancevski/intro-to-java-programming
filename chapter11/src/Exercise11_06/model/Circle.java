package Exercise11_06.model;

import Exercise11_01.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this(2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
