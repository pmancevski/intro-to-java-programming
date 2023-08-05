/*
Cramer's rule:
ax + by = e
cx + dy = f
x = ed - bf / ad - bc
y = af - ec / ad - bc
 */

public class Exercise01_13 {
    public static void main(String[] args) {
        System.out.println("x = " + ((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1)));
        System.out.println("y = " + ((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1)));
    }
}
