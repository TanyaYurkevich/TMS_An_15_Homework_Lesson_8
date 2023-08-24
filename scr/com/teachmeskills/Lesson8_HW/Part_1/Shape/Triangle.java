package com.teachmeskills.Lesson8_HW.Part_1.Shape;

public final class Triangle extends CommonShape {

    private double Side1;
    private  double Side2;
    private double Side3;
    private double Height;

    public Triangle(double side1, double side2, double side3, double height) {
        this.Side1 = side1;
        this.Side2 = side2;
        this.Side3 = side3;
        this.Height = height;
    }

    @Override
    public double getPerimeterShape() {
        double PerTriangle = Side1+Side3+Side2;
        return PerTriangle;
    }

    @Override
    public double getAreaShape() {
        double ArTriangle = Side1*Height/2;
        return ArTriangle;
    }

}
