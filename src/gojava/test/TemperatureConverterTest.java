package gojava.test;

import gojava.module04.TemperatureConverter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    private static final TemperatureConverter temperatureConverter = new TemperatureConverter();
    private static final double DELTA = 0.0000000001;

    @Test
    public void celsiusToFarenheit() throws Exception {
        double celsius = 36.6;

        Assert.assertEquals(97.88, temperatureConverter.celsiusToFarenheit(celsius), DELTA);
    }

    @Test
    public void farenheitToCelsius() throws Exception {
        double farenheit = 97.88;

        Assert.assertEquals(36.6, temperatureConverter.farenheitToCelsius(farenheit), DELTA);
    }
}