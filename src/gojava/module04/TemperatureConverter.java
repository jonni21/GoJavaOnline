package gojava.module04;

public class TemperatureConverter {

    public double celsiusToFarenheit(double celsius) {
        double farenheit = celsius * 1.8 + 32;
        return farenheit;
    }

    public double farenheitToCelsius(double farenheit) {
        double celsius = (farenheit - 32) / 1.8;
        return celsius;
    }

}
