package com.teachmeskills.Lesson8_HW.Part_1.Shape;

public final class Circle extends CommonShape {
    private double R;
    private double Pi;

    public Circle(double radius) {
        this.R = radius;
        this.Pi = Math.PI;

    }

    @Override
    public double getPerimeterShape() {
        return 2*Pi*R;
    }

    @Override
    public double getAreaShape() {
        double S = Pi*R* R;
        return S;
    }
}
