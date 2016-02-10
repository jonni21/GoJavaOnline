package gojava.test;

import gojava.module04.DistanceCalculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceCalculatorTest {

    private static final DistanceCalculator distanceCalculator = new DistanceCalculator();
    private static final double DELTA = 1e-15;

    @Test
    public void calculateDistance() throws Exception {
        double pointX1 = 4.44;
        double pointX2 = 5.45;
        double pointY1 = 3.0;
        double pointY2 = 6.50;

        Assert.assertEquals(Math.sqrt(Math.pow(pointX2 - pointX1, 2.0)
                + Math.pow(pointY2 - pointY1, 2.0)), distanceCalculator.calculateDistance(pointX1,
                pointY1, pointX2, pointY2) , DELTA);

    }
}