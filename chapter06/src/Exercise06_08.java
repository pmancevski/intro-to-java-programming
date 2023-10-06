public class Exercise06_08 {
    public static void main(String[] args) {
        double fahrenheitCount = 120.0;

        System.out.println("Celsius     Fahrenheit   |   Fahrenheit     Celsius");
        for (double celsiusCount = 40.0; celsiusCount >= 31.0; celsiusCount--){
            System.out.printf("%5.1f%15.1f%6s%10.1f%14.2f%n", celsiusCount, celsiusToFahrenheit(celsiusCount), "|",
                    fahrenheitCount, fahrenheitToCelsius(fahrenheitCount));
            fahrenheitCount -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
