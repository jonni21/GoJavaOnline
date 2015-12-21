package gojava.module04;

public class AreaCalculator {

    // Calculates triangle area using Heron's formula
    public double calculateTriangleArea(double firstSide, double secondSide, double thirdSide) {
        double semiperimeter = (firstSide + secondSide + thirdSide) / 2;
        double triangleArea = Math.sqrt(semiperimeter * (semiperimeter - firstSide)
                * (semiperimeter - secondSide) * (semiperimeter - thirdSide));
        return triangleArea;
    }

    //Calculates rectangle area
    public double calculateRectangleArea(double firstSide, double secondSide) {
        double rectangleArea = firstSide * secondSide;
        return rectangleArea;
    }

    //Calculates circle area
    public double calculateCircleArea(double radius) {
        double circleArea = Math.PI * Math.pow(radius, 2.0);
        return circleArea;
    }

}
