package gojava.module04;

public class AreaCalculator {

    // Calculates triangle area using Heron's formula
    public double calculateTriangleArea(double firstSide, double secondSide, double thirdSide) {
        double semiperimeter = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - firstSide)
                * (semiperimeter - secondSide) * (semiperimeter - thirdSide));
    }

    //Calculates rectangle area
    public double calculateRectangleArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }

    //Calculates circle area
    public double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2.0);
    }

}
