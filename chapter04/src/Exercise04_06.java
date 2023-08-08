public class Exercise04_06 {
    public static void main(String[] args) {
        final double radius = 40;

        double angle1 = (Math.random() * (2 * Math.PI));
        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);

        double angle2 = (Math.random() * (2 * Math.PI));
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);

        double angle3 = (Math.random() * (2 * Math.PI));
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double side1 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // Compute three angles
        double angleA = Math.toDegrees(Math.acos((side1 * side1 - side2 * side2 - side3 * side3)
                / (-2 * side2 * side3)));
        double angleB = Math.toDegrees(Math.acos((side2 * side2 - side1 * side1 - side3 * side3)
                / (-2 * side1 * side3)));
        double angleC = Math.toDegrees(Math.acos((side3 * side3 - side2 * side2 - side1 * side1)
                / (-2 * side1 * side2)));

        // Display results
        System.out.println("The three angles are " +
                Math.round(angleA * 100) / 100.0 + " " +
                Math.round(angleB * 100) / 100.0 + " " +
                Math.round(angleC * 100) / 100.0);
    }
}
