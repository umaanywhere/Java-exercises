class TemperatureConverter {
    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class TemperatureConversionProgram {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25.0;
        double fahrenheit = converter.convertCelsiusToFahrenheit(celsius);

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        // Simulating user input
        double userFahrenheitInput = 78.5;
        double userCelsiusInput = converter.convertFahrenheitToCelsius(userFahrenheitInput);

        System.out.println(" Fahrenheit Input: " + userFahrenheitInput);
        System.out.println(" Celsius Input: " + userCelsiusInput);
    }
}