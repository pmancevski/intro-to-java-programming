package Exercise09_09;

public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        RegularPolygon regularPolygon1 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon2 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Perimeter: %.2f%nArea: %.2f%n%n", regularPolygon.getPerimeter(), regularPolygon.getArea());
        System.out.printf("Perimeter: %.2f%nArea: %.2f%n%n", regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf("Perimeter: %.2f%nArea: %.2f%n%n", regularPolygon2.getPerimeter(), regularPolygon2.getArea());
    }
}
