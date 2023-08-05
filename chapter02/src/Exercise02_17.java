import java.util.Scanner;

public class Exercise02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperatureFahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour:");
        int windSpeed = input.nextInt();

        double windChillIndex = 35.74 + 0.6215 * temperatureFahrenheit - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperatureFahrenheit * Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill index is " + windChillIndex);
    }
}
