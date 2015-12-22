package gojava.module04;

public class DistanceCalculator {

    public double calculateDistance(double pointX1, double pointY1, double pointX2, double pointY2) {
        return Math.sqrt(Math.pow(pointX2 - pointX1, 2.0)
                + Math.pow(pointY2 - pointY1, 2.0));
    }

}
