package gojava.test;

import gojava.module04.AreaCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaCalculatorTest {

    private static final AreaCalculator areaCalculator = new AreaCalculator();
    private static final double DELTA = 1e-15;

    @Test
    public void calculateTriangleArea() throws Exception {
        double a = 4.0;
        double b = 3.0;
        double c = 5.0;

        assertEquals(6.0, areaCalculator.calculateTriangleArea(a, b, c), DELTA);
    }

    @Test
    public void calculateRectangleArea() throws Exception {
        double a = 5.0;
        double b = 7.0;

        assertEquals(a * b, areaCalculator.calculateRectangleArea(a, b), DELTA);
    }

    @Test
    public void calculateCircleArea() throws Exception {
        double a = 4.35;

        assertEquals(Math.PI * Math.pow(a, 2.0), areaCalculator.calculateCircleArea(a), DELTA);
    }
}