package gojava.module04;

public class TemperatureConverter {

    public double celsiusToFarenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public double farenheitToCelsius(double farenheit) {
        return (farenheit - 32) / 1.8;
    }
}